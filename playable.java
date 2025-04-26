import  static java.lang.System.* ;

interface playable {
    void play();
}
class Football implements  playable {
    public void play() {
        System.out.println("Football is most popular sport");
    }
}
class Volleyball implements playable {
     public void play() {
        System.out.println("volley ball is popular sport in china");
    }
}
class Basketball implements  playable{
   public void play() {
        System.out.println("basket ball is famous in USA");
    }
}
class main{
    public static void main(String []args){
System.out.println("CH LOHITH"+'\n'+"AV.SC.U4CSE24039"+'\n'+"CSE-A");
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();
            System.out.println("CH LOHITH"+'\n'+"AV.SC.U4CSE24039"+'\n'+"CSE-A");

    }
}