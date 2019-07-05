abstract class Employee{
	private String firstName;
	private String lastName;
	private String socialsecurityNumber;
	public Employee(String f,String l,String ssn){
		this.firstName = f;
		this.lastName = l;
		this.socialsecurityNumber = ssn;
	}

	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getSSN(){
		return this.socialsecurityNumber;
	}
	public void display(){
		System.out.println(this.getFirstName()+" "+this.getLastName()+"'s SSN is: "+this.getSSN());
	}
	abstract double earning();
}

class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	public HourlyEmployee(String f,String l,String ssn,double w,double h){
		super(f,l,ssn);
		this.wage = w;
		this.hours = h;
	}
	public double getWage(){
		return this.wage;
	}
	public double getHours(){
		return this.hours;
	}
	public void setWage(double w){
		if(this.wage > 0)
			this.wage = w;
	}
	public void setHour(double h){
		if(this.hours < 168 && this.hours > 0)
			this.hours = h;
	}
	public void display(){
		super.display();
		System.out.println("========================================================================");
		System.out.println("wage: "+this.getWage()+"Hours: "+this.getHours());
	}
	public double earning(){
		double earnings;
		if(this.getHours() <= 40)
		{
			earnings = this.getWage() * this.getHours();

			return earnings;
		}
		else{
			earnings = 40 * this.getWage() + (this.getHours() - 40)* this.getWage()*1.5;
			return earnings;
		}

	}

}

public class EmployeeDemo{
	public static void main(String []args){
		double earned_amt;
		HourlyEmployee he = new HourlyEmployee("Ram","Sth","12345fh4",120,35);
		he.display();
		earned_amt = he.earning();
		System.out.println("total earningS;  "+"Rs. "+earned_amt);
	}
} 