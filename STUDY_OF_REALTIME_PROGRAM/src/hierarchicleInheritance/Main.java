package hierarchicleInheritance;

public class Main {
	public static void main(String[] args) {
		
	
	Car car=new Car("BMW",120,01);
	Truck truck=new Truck("TATA",60,2000);
	
	car.move();
	truck.move();
	}
}
