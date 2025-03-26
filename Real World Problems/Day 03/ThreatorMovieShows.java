package Day_03;

import java.util.*;

class Movies{
	
	private int id;
	private String name;
	private int duration;
	
	Movies(int id, String name, int duration){
		this.id=id;
		this.name=name;
		this.duration=duration;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDUration() {
		return duration;
	}
	
	public String toString() {
		return "Movie ID: "+id+" Movie Name: "+name+" Movie Duration"+duration;
	}
}

class Theator{
	
	private int id;
	private String name;
	private List<Movies> MoviesList;
	
	Theator(int id, String name){
		
		this.id=id;
		this.name=name;
		this.MoviesList= new ArrayList<Movies>();
	}
	
	public void addMovies(Movies m) {
		
		MoviesList.add(m);
	}
	
	public void displayMovies() {
		System.out.println("Theator Id "+id+" Theator Name: "+name);
		System.out.println("Movies are: ");
		
		int cnt=0;
		for(Movies x: MoviesList) {
			System.out.println(x);
		}
		cnt++;
	}
}
public class ThreatorMovieShows {

	public static void main(String[] args) {
		
		Theator t = new Theator(101, "Vishal");
		
		Movies m1 = new Movies(1, "KALKI", 60);
		Movies m2 = new Movies(1, "KALKI", 60);
		Movies m3 = new Movies(1, "KALKI", 60);
		
		t.addMovies(m1);
		t.addMovies(m2);
		t.addMovies(m3);
		
		t.displayMovies();
	}
}
