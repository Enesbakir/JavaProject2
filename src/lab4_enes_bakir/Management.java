package lab4_enes_bakir;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
public class Management implements java.io.Serializable {
	private String name;

	public Management(String name) {
		this.name = name;
	}
	
	
	public void saveBookings(LinkedList<Customer> list) {
	      try {
	         FileOutputStream fileOut = new FileOutputStream("manageSystem.dat");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(list);
	         out.close();
	         fileOut.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}
	
	public void customerInfo(Customer customer) {
		LinkedList<Customer> infoList;
	      try {
	          FileInputStream fileIn = new FileInputStream("manageSystem.dat");
	          ObjectInputStream in = new ObjectInputStream(fileIn);
	          
	          infoList = (LinkedList<Customer>) in.readObject();
	          in.close();
	          fileIn.close();
	       } catch (IOException i) {
	          i.printStackTrace();
	          return;
	       } catch (ClassNotFoundException c) {
	          System.out.println("Customer class not found");
	          c.printStackTrace();
	          return;
	       }
	      
	      for(Customer cust:infoList) {
				if(cust.getIDNo().equals(customer.getIDNo())) {
					System.out.println(cust);
					return;
				}	
			}
			System.out.println("Customer not found!");
	      
	}
	
	public void changeBooking(Customer customer,int day) {
		LinkedList<Customer> infoList;
	      try {
	          FileInputStream fileIn = new FileInputStream("manageSystem.dat");
	          ObjectInputStream in = new ObjectInputStream(fileIn);
	          
	          infoList = (LinkedList<Customer>) in.readObject();
	          in.close();
	          fileIn.close();
	       } catch (IOException i) {
	          i.printStackTrace();
	          return;
	       } catch (ClassNotFoundException c) {
	          System.out.println("Customer class not found");
	          c.printStackTrace();
	          return;
	       }
	      
	      for(Customer cust:infoList) {
				if(cust.getIDNo().equals(customer.getIDNo())) {
					cust.setStayTime(day);
					 try {
				         FileOutputStream fileOut = new FileOutputStream("manageSystem.dat");
				         ObjectOutputStream out = new ObjectOutputStream(fileOut);
				         out.writeObject(infoList);
				         out.close();
				         fileOut.close();
				      } catch (IOException i) {
				         i.printStackTrace();
				      }
					return;
				}
			}
			System.out.println("Customer not found!");
	}
	
}
