import java.util.*;

class EvenNumber{
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    
    System.out.println("How many integer values to process?");
    int size = sc.nextInt();
    
    System.out.println("Enter "+ size +" integer value: ");
    int array[] = new int[size];
    for (int i=0;i<size;i++){
       
      array[i]=sc.nextInt();
    }
    System.out.print("Even numbers are: ");
    for(int j=0;j<size;j++){
       
      if(array[j]%2==0){
        System.out.print(array[j]+" ");
         sum = sum+array[j];
      }
    }
    System.out.println();
    System.out.println("Total even number: "+sum);
      }
}
