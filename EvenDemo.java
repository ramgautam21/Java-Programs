import java.util.Scanner;
public class EvenDemo{
	public static void main(String[] args) {
		int size,sum =0;
		Scanner sc = new Scanner(System.in);
		int[] arr;
		System.out.print("How many Integer Value to Process?:    ");
		size = sc.nextInt();
		System.out.println();
		arr = new int[size];
		System.out.print("Enter the "+size+" integer values: ");

		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("The even numbers are: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 ==0){
				System.out.print(arr[i]+ "  ");
				sum = sum+arr[i];
			}
		}
		System.out.println();
		System.out.println("Total sum of even number: "+sum);



	}
}