public class My_class{
static int count=0;
final double pi=3.1415;
My_class(){
count= ++count;
}
public void display(){
System.out.println("value of count is="+count+'\n'+ "value of pi is="+pi);
}
public static void main(String[]args){
My_class obj1=new My_class();
My_class obj2=new My_class();
My_class obj3=new My_class();
obj1.display();
obj2.display();
obj3.display();
}
}