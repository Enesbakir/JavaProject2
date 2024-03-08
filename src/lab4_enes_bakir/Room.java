package lab4_enes_bakir;

public class Room implements java.io.Serializable {
	private int roomNumber;
	private int roomCost;
	
	public Room(int roomNumber, int roomCost) {
		this.roomNumber = roomNumber;
		this.roomCost = roomCost;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public double getRoomCost() {
		return roomCost;
	}
	
	
	
}
