class Box{
	static int object_count = 0;
	int length;
	public Box(int l){
		this.length = l;
		object_count++;
	}
	public static void display(){
		System.out.println("The total number of object: "+ object_count);
	}
}
public class Count{
	public static void main(String[] args) {
		Box b1 = new Box(10);
		Box b2 = new Box(20);
		Box b3 = new Box(30);
		Box b4 = new Box(40);
		System.out.println("The length of first box: "+ b1.length);
		Box.display(); 

		
		
	}
}