package hierarchicleInheritance;

public class Vehicle {
	
	private String name;
	private int speed;
	public Vehicle(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void move() {
		System.out.println("The vehicle is moving");
	}

}
