class vehicle 
{
    public void displayinfo()
	{
        System.out.println("This is the vehicle information");
    }
}
class car extends vehicle
{

    public void displayinfo(String car_company , String car_model, int car_price,int car_seating_capacity,boolean petrol)
	{
        System.out.println("the car company is " + car_company+'\n'+"the car model is "+car_model +'\n'+"the car price is "+car_price+'\n'+"the car seating capacity"+ car_seating_capacity+'\n'+"car fuel tank type is "+petrol);
    }
}
class main
{
    public static void main(String[] args) 
	{
        car c = new car();
		c.displayinfo();
        c.displayinfo("BMW","Mrcedies",19934,6,true);
    }
}