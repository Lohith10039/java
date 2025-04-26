abstract class PatternPrinter{
    public abstract void printPattern(int n);

    public void display(String str){
        System.out.println("/n " + str);
        System.out.println("----------------");
       

    }
        
 }

class StarPattern extends PatternPrinter{
    public void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(); 
        }

    }
}
class NumberPattern extends PatternPrinter{
    public void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
class Main{
    public static void main(String[] args){
 System.out.println("CH LOHITH"+'\n'+"AV.SC.U4CSE24039"+'\n'+"CSE-A");

        StarPattern s =new StarPattern();
        s.display("Star Pattern");
        s.printPattern(5);
        

        NumberPattern n = new  NumberPattern();
        n.display("number pattern");
        n.printPattern(5);
       

    }
}
