package bai7;

public class ToaDo {
	private String ten;
	private float x;
	private float y;
	
	// package
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if (ten!=null) {
			this.ten = ten;
		} else throw new Exception("Loi ten!!");
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	// contructor
	public ToaDo() {
	}
	public ToaDo(String ten, float x, float y) {
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	
	// toString
	@Override
	public String toString() {
		return String.format("%s(%f, %f)", ten, x, y);
	}
}
