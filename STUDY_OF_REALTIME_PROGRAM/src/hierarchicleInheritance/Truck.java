package hierarchicleInheritance;

public class Truck extends Vehicle {
	private int getCargoCapacity;
    public Truck(String name, int speed, int getCargoCapacity) {
		super(name, speed);
		this.getCargoCapacity = getCargoCapacity;
	}
	public int getGetCargoCapacity() {
		return getCargoCapacity;
	}
	public void setGetCargoCapacity(int getCargoCapacity) {
		this.getCargoCapacity = getCargoCapacity;
	}

    @Override
    public void move() {
    	System.out.println("The truck is moving");
    }


 
}
