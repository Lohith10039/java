abstract class Shape3D{
    double volume, surfaceArea;
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D{
    double radius;
    
    Sphere(double radius){
        this.radius=radius;
    }
    
    public void calculateVolume(){
        volume = 4.0/3.0 * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere is: " + volume);
    }

    public void calculateSurfaceArea(){
        surfaceArea = 4.0 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere is: " + surfaceArea);
    }
}

class Cube extends Shape3D{
    double side;

    Cube(double side){
        this.side=side;
    }
    
    public void calculateVolume(){
        volume = side * side * side;
        System.out.println("Volume of Cube is: " + volume);
    }

    public void calculateSurfaceArea(){
        surfaceArea = 6.0 * side * side;
        System.out.println("Surface Area of Cube is: " + surfaceArea);
    }
}

 class Main {
    public static void main(String[] args) {
System.out.println("CH LOHITH"+'\n'+"AV.SC.U4CSE24039"+'\n'+"CSE-A");

        Sphere sphere = new Sphere(4);
        sphere.calculateSurfaceArea();
        sphere.calculateVolume();
        System.out.println();

        Cube cube = new Cube(4);
        cube.calculateSurfaceArea();
        cube.calculateVolume();
    }   
}
