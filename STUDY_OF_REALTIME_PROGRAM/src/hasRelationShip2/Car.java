package hasRelationShip2;

public class Car {
	private String make;
	private Engine engine ;
	public Car(String make, int horsePower) {
		super();
		this.make = make;
		this.engine = new Engine(horsePower);
	}
	public void startCar() {
		System.out.println("Start the Car !!!");
		System.out.println(make+"car started!!");
	}

}
