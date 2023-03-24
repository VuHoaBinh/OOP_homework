package bai4;


public class test_Vehicle {

	public static void main(String[] args) {
		Vehicle xe1 = new Vehicle("Nguyen Thu Loan","Future Neo",100,35000000);
		Vehicle xe2 = new Vehicle("Le Minh Tinh","Ford Ranger",3000,250000000);
		Vehicle xe3 = new Vehicle("Nguyen Minh Triet","Landscape",1500,100000000);
		
		System.out.println(Vehicle.getTieuDe());
		System.out.println(xe1.toString());
		System.out.println(xe2.toString());
		System.out.println(xe3.toString());

	}

}
