package bai6;

public class phongThucHanh extends phong{
	private int numOfComputers;

	public phongThucHanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public phongThucHanh(String roomCode, String building, double area, int numOfLights) {
		super(roomCode, building, area, numOfLights);
		// TODO Auto-generated constructor stub
	}

	public phongThucHanh(String roomCode, String building, double area, int numOfLights, int numOfComputers) {
		super(roomCode, building, area, numOfLights);
		this.numOfComputers = numOfComputers;
	}

	public int getNumOfComputers() {
		return numOfComputers;
	}

	public void setNumOfComputers(int numOfComputers) {
		this.numOfComputers = numOfComputers;
	}
	public int NumOfComputers() {
        return this.numOfComputers;
    }
	@Override
	public String toString() {
		String s ="";
		s+=String.format("|%10s|", getNumOfComputers());
		return super.toString()+s;
	}
}
