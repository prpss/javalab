package second;

public class Book {
	String title,author,pub;
	double price;
	
	Book(String title,String author,String pub,Double price){
	    this.title=title;
	    this.author=author;
	    this.pub=pub;
	    this.price=price;
	}
	


	public String toString() {
		String str="title is "+title+" author is "+author+" publis is  "+pub+" price is  "+price;
		return str;
	}

}