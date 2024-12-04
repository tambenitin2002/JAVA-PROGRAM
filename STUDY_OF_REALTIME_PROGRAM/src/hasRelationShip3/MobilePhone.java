package hasRelationShip3;

public class MobilePhone {
	private String brand;
	private String model;
	private SimCard simCard;
	public MobilePhone(String brand, String model, SimCard simCard) {
		super();
		this.brand = brand;
		this.model = model;
		this.simCard = simCard;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public SimCard getSimCard() {
		return simCard;
	}
	public void setSimCard(SimCard simCard) {
		this.simCard = simCard;
	}
	public void displayMobile() {
		System.out.println("Mobile Brand is "+brand+"and Model is "+model);
		System.out.println("The following Detail about the simcard");
		System.out.println("The simcard number is "+simCard.getSimNumber());
		System.out.println("The Simcar career is "+simCard.getCareer());
	}
	

}
