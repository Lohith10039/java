public class book{
String title_of_the_book;
String author_of_the_book;
int year_of_publications;
public book(String title_of_the_book,String author_of_the_book,int year_of_publications){
this.title_of_the_book = title_of_the_book;
this.author_of_the_book = author_of_the_book;
this.year_of_publications = year_of_publications;
}
public void display(){
System.out.println("title of the book="+title_of_the_book+'\n'+"author of the book="+author_of_the_book+'\n'+"year of publications="+year_of_publications+'\n');
}
public static void main(String[] args){
book b1= new book("Iron Man","stan lee",1964);
book b2= new book("Thor","stan lee",1952);
b1.display();
b2.display();
}
}
