package bai6;

public class phongThiNghiem extends phong{
	private String specialization;
    private int capacity;
    private boolean hasSink;
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isHasSink() {
		return hasSink;
	}
	public boolean getHasSink() {
        return this.hasSink;
    }
	public void setHasSink(boolean hasSink) {
		this.hasSink = hasSink;
	}
	public phongThiNghiem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public phongThiNghiem(String roomCode, String building, double area, int numOfLights) {
		super(roomCode, building, area, numOfLights);
		// TODO Auto-generated constructor stub
	}
	public phongThiNghiem(String roomCode, String building, double area, int numOfLights, String specialization,
			int capacity, boolean hasSink) {
		super(roomCode, building, area, numOfLights);
		this.specialization = specialization;
		this.capacity = capacity;
		this.hasSink = hasSink;
	}
	@Override
	public String toString() {
		String s ="";
		s+=String.format("|%10s|%10s|%10s|", getSpecialization(), getCapacity(),getHasSink());
		return super.toString()+s;
	}
}
