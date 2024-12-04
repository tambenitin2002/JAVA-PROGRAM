package bankManagement;

public class Account {
	private int pin;
	private String name;
	private long acno;
	private String ifsc;
	private int bal;
	private long cont;
	private String city;
	public Account(int pin, String name, long acno, String ifsc,int bal, long cont, String city) {
		super();
		this.pin=pin;
		this.name = name;
		this.acno = acno;
		this.ifsc = ifsc;
		this.bal=bal;
		this.cont = cont;
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setName(int pinn) {
		this.pin = pin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public long getCont() {
		return cont;
	}
	public void setCont(long cont) {
		this.cont = cont;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
	

}
