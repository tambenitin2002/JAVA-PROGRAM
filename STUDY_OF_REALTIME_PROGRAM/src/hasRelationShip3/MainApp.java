package hasRelationShip3;

public class MainApp {
	public static void main(String[] args) {
		SimCard sc=new SimCard("9246521325", "Tele comunication");
		MobilePhone phone= new MobilePhone("iphone ", "i15", sc);
		phone.displayMobile();
	}

}
