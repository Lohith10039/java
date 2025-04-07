class cacluato{
    public int add(int a, int b){
        return a+b;
    }
    public Double add(Double a , Double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
class main{
    public static void main(String[] args) {
        cacluato d = new cacluato();
        System.out.println( "sum of 5 and 6 is:"+ d.add(5, 6));
        System.out.println("sum of 5.5 and 6.6 is:"+ d.add(5.5,6.6));
        System.out.println("sum of 5,6 and 7 is:"+ d.add(5,6,7));
    }
}

    
