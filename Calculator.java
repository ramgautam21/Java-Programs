import java.util.Scanner;
public class Calculator{
	
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	public static int div(int a,int b){
		return a/b;
	}
	public static int mod(int a,int b){
		return a%b;
	}
	public static void main(String[] args) {
		int a,b,res,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ADD 2.SUB 3.MUL 4.DIV 5.MOD press any to exit");
		System.out.println("Enter Your Choice: ");
		choice = sc.nextInt();
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter Second number: ");
		b = sc.nextInt();
		switch(choice){
			case 1: 
					res = add(a,b);
					System.out.println("The sum= "+res);
					break;
			case 2: 
					res = sub(a,b);
					System.out.println("The sub= "+res);
					break;
			case 3: 
					res = mul(a,b);
					System.out.println("The prod= "+res);
					break;
			case 4: 
					res = div(a,b);
					System.out.println("The quo= "+res);
					break;
			case 5: 
					res = mod(a,b);
					System.out.println("The remainder= "+res);
					break;
			default : System.out.println("INVALID INPUT !!!!!!");
		}
	}
}