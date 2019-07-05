class Figure{
	private int sides;
	public Figure(int l){
		this.sides = l;
	}
	public int getSides(){
		return this.sides;
	}
}


class Square extends Figure{
	private String Color;
	public Square(int l,String c){
		super(l);
		this.Color = c;
	}


	public String getColor(){
		return this.Color;
	}
	public int Area(){
		return (super.getSides() * super.getSides());
	}
}

public class SquareDemo{
	public static void main(String []args){
		Square s = new Square(10,"red");
		System.out.println("============================================================");
		System.out.println("The area is: "+s.Area()+" sq.cm ");
		System.out.println("The Color is: "+s.getColor());
	}
}