

class shape{
    public Double area( Double a ){
        return a*a;
    }
    public  Double area(Double length , Double breadth ){
        return length*breadth;
    }
}
class circle extends shape{
    public Double area(Double radius){
        return 3.14*radius*radius;
    }
}

class main{
    public static void main(String[]args){
        shape s = new shape();
        circle c = new circle();
        System.out.println("area of square is "+s.area(5.0));
        System.out.println("area of rectangle is"+s.area(5.0,6.0));
        System.out.println("area of circle is "+c.area(3.0));
    }
}
