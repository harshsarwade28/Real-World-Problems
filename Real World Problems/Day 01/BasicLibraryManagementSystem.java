package Day_01;

class Library{
	
	String title;
	String author;
	String ISBN;
	
	  Library(String title, String author, String ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	
	public void display() {
		System.out.println(title+" "+author+" "+ISBN);
	}
}

class Ebook extends Library{
	
	double fileSize;
	
	  Ebook(String title, String author, String ISBN, double fileSize){
		 super(title, author, ISBN);
		 this.fileSize=fileSize;
	  }
	
	public void display1() {
		System.out.println(fileSize);
	}
}
public class BasicLibraryManagementSystem {

	public static void main(String[] args) {
		
		Ebook e = new Ebook("VIkram", "Harsh", "ctvuhb", 100);
		e.display();
		e.display1();
	}
}
