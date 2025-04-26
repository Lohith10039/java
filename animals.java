abstract class animals{
abstract void sound();
}
class lion extends animals{
public void sound(){
System.out.println("lion roar");
 }
}
class tiger extends animals{
public void sound(){
System.out.println("tiger growl");
}
}
class main{
public static void main(String[]args){
System.out.println("CH LOHITH"+'\n'+"AV.SC.U4CSE24039"+'\n'+"CSE-A");
tiger t = new tiger();
t.sound();
lion l = new lion();
l.sound();
}
}