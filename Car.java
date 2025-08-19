package cars;

public class Car {
	private String brand ;
	private String model ;
	private double price ;
	private double mileage ;
	private String ownerName ;
	
    private static int totalcars;
    private static String showroomName="Awesome"; 
    public static Car c1;
    
    public Car (String brand, String model, double price, double mileage) {
        this.model=model;
		this.brand = brand;
        this.price=price;
        this.mileage=mileage;
        this.ownerName="Not Assigned";
        totalcars++;
    } 

        public Car(String brand, String model, double price, double mileage, String owner) {
            this.model=model;
            this.brand=brand;
            this.price=price;
            this.mileage=mileage;
            this.ownerName=owner;
            totalcars++;
        }
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String Owner) {
	this.ownerName=Owner;
}
public void Displaydetails() {
	System.out.println("brand:" + brand);
	System.out.println("model:" + model);
	System.out.println("price:" + price);
	System.out.println("mileage:" + mileage);
	System.out.println("owner:" + ownerName);
}
public void updateprice(double newprice) {
	this.price=newprice;
}
public static void showTotalCars() {
	System.out.println("Total Cars:" +totalcars);
}
public static void showShowroomName() {
	System.out.println("Showroom:" +showroomName);
}	
}
