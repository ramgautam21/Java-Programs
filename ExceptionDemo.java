public class ExceptionDemo{
	public static void main(String[] args) {
		try{
			int i = 4;
			int res;
			res = i/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}