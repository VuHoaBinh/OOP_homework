package bai8;

public class student extends person {
	private double grade1;
    private double grade2;
	public double getGrade1() {
		return grade1;
	}
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	public double getGrade2() {
		return grade2;
	}
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public student(String name, String address, double grade1, double grade2) {
		super(name, address);
		this.grade1 = grade1;
		this.grade2 = grade2;
	}
	public double getAverageGrade() {
        return (getGrade1() + getGrade2()) / 2;
    }

    public String getEvaluation() {
        double avg = getAverageGrade();
        if (avg >= 8.0) {
            return "Excellent";
        } else if (avg >= 6.5) {
            return "Good";
        } else if (avg >= 5.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
    @Override
    public String toString() {
    	String s= "";
    	s+=String.format("|%10f|%10f|%10f|%10s|", getGrade1(), getGrade2(), getAverageGrade(), getEvaluation());
    	return super.toString()+s;
    }
}
