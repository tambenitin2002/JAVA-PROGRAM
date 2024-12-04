package hierarchicleInheritance;

public class Car extends Vehicle{
	private int numOfWheel;

	public Car(String name, int speed, int numOfWheel) {
		super(name, speed);
		this.numOfWheel = numOfWheel;
	}

	public int getNumOfWheel() {
		return numOfWheel;
	}

	public void setNumOfWheel(int numOfWheel) {
		this.numOfWheel = numOfWheel;
	}
	@Override
	public void move() {
		System.out.println("The car is moving");
	}

}
