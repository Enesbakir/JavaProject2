package lab4_enes_bakir;

public class Customer implements java.io.Serializable {
	private String name;
	private Room room;
	private int stayTime;
	private Integer IDNo;
	
	public Customer(Integer iDNo,String name,int stayTime ,Room room ) {
		this.name = name;
		this.room = room;
		this.stayTime = stayTime;
		this.IDNo = iDNo;
	}
	
	public String getName() {
		return name;
	}

	public Room getRoom() {
		return room;
	}

	public int getStayTime() {
		return stayTime;
	}

	public Integer getIDNo() {
		return IDNo;
	}
	
	public void setStayTime(int stayTime) {
		this.stayTime = stayTime;
	}

	@Override
	public String toString() {
		
		return "Customer Name:" + this.getName()+
				"\nRoom Number:" + this.getRoom().getRoomNumber()+
				"\nStay Time:"+ this.getStayTime()+ " days"+
				"\nTotal Cost:" + (double)(this.getStayTime()*this.getRoom().getRoomCost());
	}
	
}
