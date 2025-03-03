public class book_s {
	private String title;
	private String Author;
	private int year;
public book_s(String title,String Author,int year) {
	this.title = title;
	this.Author = Author;
	this.year = year;
}
public void bookDetails() {
	System.out.println("Title of the Book :"+title);
	System.out.println("Author of the Book :"+Author);
	System.out.println("Year of publication :"+year);
}
public static void main(String [] args) {
	book_s book1 = new book_s("Iron Man","Stan Lee",1964);
	book1.bookDetails();
	book_s book2 = new book_s("Cosmic king thor","Stan Lee",1983);
	book2.bookDetails();
}
}