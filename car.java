public class car{
        public String car_colour;
	public String car_brand;
	public String fuel_type;
	public String mileage;
	car(String car_colour,String car_brand,String fuel_type,String mileage){
		this.car_colour = car_colour;
		this.car_brand = car_brand;
		this.fuel_type = fuel_type;
		this.mileage = mileage;
	}

	public void start(){
		System.out.println("car is started");
	}
	public void stop() {
		System.out.println("car is stopped");
	}
	public void service() {
		System.out.println("car is for service");
	}

}/*end of class car*/
class main{
public static void main(String[] args){	
System .out.println("  welcome  ");
	car car1 = new car("red","ferrari","petrol","90");
	
	System.out.println("1st car is "+ car1.car_colour);
	System.out.println("colour of car "+ car1.car_brand);
	System.out.println("fuel type of car"+ car1.fuel_type);
	System.out.println("car mileage "+ car1.mileage);
	car1.start();
	car1.stop();
	car1.service();
	system.out.println("  ")

        car car2 = new car("white","porsche","petrol","30");
	
	System.out.println("2nd car is "+ car2.car_colour);
	System.out.println("colour of car "+ car2.car_brand);
	System.out.println("fuel type of car"+ car2.fuel_type);
	System.out.println("car mileage "+ car2.mileage);
	car2.start();
	car2.stop();
	car2.service();
	system.out.println("  ")

	car car3 = new car("black","lambo","petrol","10");
	
	System.out.println("3rd car is "+ car3.car_colour);
	System.out.println("colour of car "+ car3.car_brand);
	System.out.println("fuel type of car"+ car3.fuel_type);
	System.out.println("car mileage "+ car3.mileage);
	car3.start();
	car3.stop();
	car3.service();
	system.out.println("  ")
}

}
