package bai6;

public class phongLyThuyet extends phong{
	private boolean hasProjector;

	public boolean isHasProjector() {
		return hasProjector;
	}

	public void setHasProjector(boolean hasProjector) {
		this.hasProjector = hasProjector;
	}

	public phongLyThuyet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public phongLyThuyet(String roomCode, String building, double area, int numOfLights) {
		super(roomCode, building, area, numOfLights);
		// TODO Auto-generated constructor stub
	}

	public phongLyThuyet(String roomCode, String building, double area, int numOfLights, boolean hasProjector) {
		super(roomCode, building, area, numOfLights);
		this.hasProjector = hasProjector;
	}
	public boolean getHasProjector() {
        return this.hasProjector;
    }
	@Override
	public String toString() {
		String s ="";
		s+=String.format("|%10s|", getHasProjector());
		return super.toString()+s;
	}
}
