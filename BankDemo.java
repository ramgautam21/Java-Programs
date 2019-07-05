class NegativeValue extends Exception{
	private double value;
	public NegativeValue(String s){
		super(s);
	}
	public NegativeValue(String s,double value){
		super(s);
		this.value = value;
	}
	public void getValue(){
		System.out.println("The value passed is: "+this.value);
	}
}

class BankAccount{
	private double balance;
	public BankAccount(double balance) throws NegativeValue{
		if(balance < 0){
			throw new NegativeValue("value is negative",balance);
		}
		else{
			this.balance = balance;
		}

	}
}

public class BankDemo{
	public static void main(String[] args){
		try{
			BankAccount ac = new BankAccount(-10);
		}catch(NegativeValue e){
			// e.printStackTrace();
			System.out.println(e.toString());
			e.getValue();
		}

	}
}