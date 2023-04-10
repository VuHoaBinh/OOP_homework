package bai6;

import java.util.Objects;

public class phong {
	 private String roomCode;
	 private String building;
	 private double area;
	 private int numOfLights;
	 public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getNumOfLights() {
		return numOfLights;
	}
	public void setNumOfLights(int numOfLights) {
		this.numOfLights = numOfLights;
	}
	public phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public phong(String roomCode, String building, double area, int numOfLights) {
		super();
		this.roomCode = roomCode;
		this.building = building;
		this.area = area;
		this.numOfLights = numOfLights;
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, building, numOfLights, roomCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		phong other = (phong) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(building, other.building) && numOfLights == other.numOfLights
				&& Objects.equals(roomCode, other.roomCode);
	}
	
	@Override
	public String toString() {
		String s = "";
		s+=String.format("|%10s|%10s|%10f|%10d|", getRoomCode(), getBuilding(), getArea(), getNumOfLights());
		return s;
	}
	
	 
}
