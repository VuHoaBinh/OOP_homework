package bai8;

public class customer extends person{
	 private String companyName;
    private double billValue;
    private String rating;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getBillValue() {
		return billValue;
	}
	public void setBillValue(double billValue) {
		this.billValue = billValue;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customer(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public customer(String name, String address, String companyName, double billValue, String rating) {
		super(name, address);
		this.companyName = companyName;
		this.billValue = billValue;
		this.rating = rating;
	}
	@Override
    public String toString() {
    	String s= "";
    	s+=String.format("|%10s|%10s|%10s|%10f|%10s|", getName(), getAddress(), getCompanyName(), getBillValue(), getRating());
    	return super.toString()+s;
    }
}
