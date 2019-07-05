class Movie{
	private String movieId;
	private String title;
	private String director;
	private String sponsor;
	private double price;
	public Movie(String movieId,String title,String director,String sponsor,double price){
		this.movieId = movieId;
		this.title = title;
		this.director = director;
		this.sponsor = sponsor;
		this.price = price;
	}
	public Movie(){
		this.director = "Brick Stone";
		this.sponsor = "ABC Films";
		this.price = 59.50;
	}
	public void setMovieId(String id){
		this.movieId = id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getMovieId(){
		return this.movieId;
	}
	public String getTitle(){
		return this.title;
	}
	public void Output(){
		
		System.out.println(this.getMovieId()+"\t"+this.getTitle()+"\t"+this.director+"\t"+this.sponsor+"\t\t\t"+this.price);
	}

}
public class MovieDemo{
	public static void main(String[] args) {
		Movie m = new Movie("M001","Frozen","Tom Cruise","Universal Studio",120);
		Movie m1 = new Movie();
		m1.setMovieId("M003");
		m1.setTitle("Robotic");
		System.out.println("ID\t"+"Title\t"+"Director\t"+"Sponsor\t\t\t"+"Price");
		m.Output();
		m1.Output();
	}
}