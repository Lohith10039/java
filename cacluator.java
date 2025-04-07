public class cacluator {
    public int add( int a,int b){
        int addition = a+b;
        return addition;
    }
}
class advanced_cacluator extends cacluator{
    public int sub(int a ,int b){
        int subraction=a-b;
        return subraction;
    }
}
class scientific_cacluator extends advanced_cacluator{
    public int multi(int a , int b){
        int multiplication=a*b;
        return multiplication;
    }
}
class super_cacluator extends scientific_cacluator{
    public int div(int a,int b){
        if(b !=0){
            return a/b;
        }else{
            System.out.println("the ans is undefine");
            return a/b;
        }
    }

}
class main{
    public static void main(String []args){
        super_cacluator obj = new super_cacluator();
        System.out.println("additon is:"+obj.add(4,3));
        System.out.println("substraction is:"+obj.sub(4,3));
        System.out.println("multiplication is:"+obj.multi(4,3));
        System.out.println("division is:"+obj.div(4,3));
        System.out.println("division is:"+obj.div(4,0));

    }
}
