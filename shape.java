interface shape{
	
	int getPerimeter();

}
class traingle implements shape{
	int side1,side2,side3;
	triangle(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	
}
 	int getPerimeter(){
		return side1+side2+side3;

}
class rectangle implements shape{
	int length; int breadth;
	rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;

}
int getPerimeter(){
		return 2*(length+breadth);

}
}
class Circle implements Shape {
   int radius;
    private static final double PI = 3.14159;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;


    }
}

class main{
    public static void main(String[] args) {

        rectangle rec = new rectangle(5, 3);
        Circle circle = new Circle(4);
        triangle tri = new triangle(3, 4, 5);

        System.out.println("Rectangle Perimeter: " + rec.getPerimeter());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter());
    }

}
}