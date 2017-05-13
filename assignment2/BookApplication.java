package assignment2;

/*Author: Mamoutou Sangare
 * created on May 5, 2015
 * Purpose: created a class name Book which has a title, author name, price, number of pages
 * and also the number of books created. The class Book has three children.
 * Two direct children (fiction book, and nonfiction) and another one called TextBook from nonfiction.
 * The main class creates 6 objects of type book
 *    - 2 fiction books
 *    - 4 nonfiction books (which have 3 textbook)
 */

public class BookApplication {
	public static void main (String[]args) {
	
	   Book [] myBooks = new Book[2]; //it declares myBooks of type book.It can hold at most 6 elements of type book
	   myBooks[0] = new FictionBook ("Huckelberry Finn", 100);
	 //  myBooks[0].setType("Fiction");
	   myBooks [1] = new NonFictionBook ("Finn", 20);
	//   myBooks[2] = new TextBook ("Les frasques", "Math 101 ", 100);
       
	   for (int i=0; i< myBooks.length; ++ i){
		  System.out.println (myBooks[i].toString());
		  System.out.println ("===========================================");// space between the books created
	   }
       System.out.println ("Total number of Books created: " + Book.getBookNumber()); // number of books created

	   
	}
}

class Book {
	
	private String bookTitle;
	private String authorName;
    double bookPrice;
	private int pageNumber;
    static int bookNumber;
	
	public Book (){
		bookTitle = "";
		authorName = "";
		bookPrice = 0.0;
		pageNumber = 0;
		++ bookNumber;
	}
	
	public Book (String bookTitle){
		this.bookTitle = bookTitle;
		++ bookNumber;
		
	}
	public Book (String bookTitle, String authorName){
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		++ bookNumber;
		
	}

	
	public Book (String t, String a, double price, int page){
		bookTitle = t;
		authorName = a;
		bookPrice = price;
		pageNumber = page;
		++ bookNumber;
	}
	public void setBookTitle (String t){
		bookTitle = t;
	}
	
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	
	public void setBookPrice (double bookPrice){
		this.bookPrice = bookPrice;
	}
	
	public void setNumberPage(int n){
		pageNumber = n;
	}
	public String getBookTitle (){
		return bookTitle; 
	}
	
	public String getAuthorName(){
		return authorName ;
	}
	
	public double getBookPrice (){
		return bookPrice; 
	}
	
	public int getPageNumber (){
		return pageNumber;
	}
	
	
	
	public static int getBookNumber (){
		return bookNumber;
	}
	
	public String toString (){
		return ("Title: " + getBookTitle() + "\n" + "Author: " + getAuthorName() +
		"\n" + "Number of pages: " + getPageNumber() +
		"\n" + "Book cost: $" + getBookPrice());
	}
}

//==================================================================

class FictionBook extends Book {
	
	// public FictionBook (String t, String a, double p,int n){
	//	super(t,a,p,n);
	// }
	private String type;
	
	public FictionBook (String t) {
		super(t);
	}
	
	public FictionBook (String t, int p) {
		super(t);
		super.setNumberPage(p);;
	}
	
	public String getType (){
		return type;
	}
	
	public void setBookPrice (){
		super.setBookPrice(24.99);
	}

	public void setType (String type){
		this.type = type;
	}
	public  String toString (){
		return ("Book Type: " + getType() + "\n" + "Title: " + getBookTitle() + "\n" + 
	             "Price: " + getBookPrice() + "\n" + "Page: " + getPageNumber());
	}
}
//==================================================================
class NonFictionBook extends Book {
	private String type;
//	public NonFictionBook (String t, String a, double p, int n){
//		super (t,a,p,n);
//	}
	public NonFictionBook (){
		type ="";
	}
	public NonFictionBook (String t){
		super(t);
	
	}
	public NonFictionBook (String t, int pn){
		super(t);
		super.setNumberPage(pn);
	}
	
	
	public String getType (){
		return type;
	}
	
	public void setBookPrice (){
		super.setBookPrice(24.99);
	}

	public void setType (String type){
		this.type = type;
	}
	public  String toString (){
		return ("Book Type: " + getType() + "\n" + "Title: " + getBookTitle() + "\n" 
				+ "Price: " + getBookPrice());
	}
}
//==================================================================
class TextBook extends NonFictionBook {
	
	private String gradeLevel;
	private String type;
	
	//public TextBook (String t, String a, double p, int n, String gradeLevel){
	//	super (t,a,p,n);
	//	this.gradeLevel = gradeLevel;
	//}
	
	public TextBook (){
		gradeLevel = "";
		type = "";
				
	}
	public TextBook (String title){
		super(title);	
	}
	
	public TextBook (String t, String g, int pn){
		type = t;
		gradeLevel = g;
		super.setNumberPage(pn);		
				
	}
	public void setGradeLevel (String g){
		gradeLevel = g;
	}
	public String setGradeLevel (){
	 return  gradeLevel;
	}
	public String getGradeLevel (){
		return gradeLevel;
	}
	
	
	public String toString (){
		return (  "GradeLevel: " + getGradeLevel() +"\n" + 
	             "page Number: " + getPageNumber());
    } 
 }