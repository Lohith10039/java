public class vehicle {
    public String brand;
    public int speed;
    public vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void start() {
        System.out.println(brand + " is starting");
    }
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
class Car extends vehicle {
    private int noOfDoors;
    public Car(String brand, int speed, int noOfDoors) {
        super(brand, speed);
        this.noOfDoors = noOfDoors;
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("Number of Doors: " + noOfDoors);
    }
}
class Bike extends vehicle {
    private boolean hasGears;
    public Bike(String brand, int speed, boolean hasGears) {
        super(brand, speed);
        this.hasGears = hasGears;
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("Has Gears: " + (hasGears ? "Yes" : "No"));
    }
}
class Truck extends vehicle {
    private int capacity; 
    public Truck(String brand, int speed, int capacity) {
        super(brand, speed);
        this.capacity = capacity;
    }
    public void showTruck() {
        super.showDetails();
        System.out.println("Capacity: " + capacity + " tons");
    }

}
class main {
    public static void main(String[] args) {
        Car car = new Car("Porshe", 150, 4);
        Bike bike = new Bike("Discover", 120, true);
        Truck truck = new Truck("Ashok Leyland", 90, 10);
        System.out.println("Car Details");
        car.start();
        car.showDetails();
        System.out.println("Bike Details");
        bike.start();
        bike.showDetails();
        System.out.println("Truck Details");
        truck.start();
        truck.showTruck(); 
        System.out.println("Vedagayathri");
    }
}