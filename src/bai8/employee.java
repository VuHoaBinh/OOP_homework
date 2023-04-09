package bai8;

public class employee extends person{
	private double salaryCoefficient;

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public employee(String name, String address, double salaryCoefficient) {
		super(name, address);
		this.salaryCoefficient = salaryCoefficient;
	}
	public String getEvaluation() {
        if (salaryCoefficient >= 2.0) {
            return "Excellent";
        } else if (salaryCoefficient >= 1.5) {
            return "Good";
        } else if (salaryCoefficient >= 1.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
	@Override
    public String toString() {
    	String s= "";
    	s+=String.format("|%10f|%10s|", getSalaryCoefficient(), getEvaluation());
    	return super.toString()+s;
    }
}
