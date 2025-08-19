package cars;
	public class Showroom {
	    public static void main(String[] args) {
	        Car c1 = new Car("Toyota", "Corolla", 15000, 18.5);
	        Car c2 = new Car("Honda", "Civic", 20000, 16.0, "John");
	        Car c3 = new Car("Hyundai", "i20", 12000, 20.0);
	        
            System.out.println("c1 details");
	        c1.Displaydetails();
	        System.out.println("c2 details");
	        c2.Displaydetails();
	        System.out.println("c3 details");
	        c3.Displaydetails();

	        c1.setOwnerName("Neha"); 
	        c1.updateprice(16000);
	        System.out.println("c1 updated:");
	        c1.Displaydetails();

	        Car.showShowroomName();
	        Car.showTotalCars();
	    }
	}


