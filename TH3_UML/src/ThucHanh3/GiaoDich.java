package ThucHanh3;

public class GiaoDich {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE=0.035;
	
	// package
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long account) throws Exception {
		if (account > 0) {
			this.accountNumber = account;			
		}else throw new Exception("so tai khoan ko con");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name!=null) {
			this.name = name;
		}else throw new Exception("ten ko hop le");
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) throws Exception {
		if(balance >0) {
			this.balance = balance;
		}else throw new Exception("tien du ko hop le");
	}
	public double getRATE() {
		return RATE;
	}
	
	
	
	// constructor
	public GiaoDich(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	// property get
	public boolean deposit( double amount) {
		if (amount<=0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean withdraw( double amount, double fee) {
		if(amount <0 && amount+ fee >=this.balance) {
			return false;
		}else
		{
			return true;
		}
	}
	
	public void addInterest() {
		this.balance = this.balance + this.balance*RATE;
	}
	
	public boolean transfer(GiaoDich acc2, double amount) {
		if(amount <0 ) {
			return false;
		}else
		{
			acc2.balance = amount;
			return true;
		}
	}
	
	// toString
	@Override
	public String toString() {
		return "GiaoDich [accountNumber=" + accountNumber + ","
				+ " name=" + name + ", balance=" + balance + ", RATE=" + RATE
				+ "]";
	}
	
}
