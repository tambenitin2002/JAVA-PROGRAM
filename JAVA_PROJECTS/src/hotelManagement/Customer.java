package hotelManagement;

public class Customer {

	private String cname;
	private long cno;
    private String area;
    private int order1;
    private int order2;
    private int order3;
	public Customer(String cname, long cno, String area, int order1,int order2,int order3) {
		super();
		this.cname = cname;
		this.cno = cno;
		this.area = area;
		this.order1 = order1;
		this.order2 = order2;
		this.order3 = order3;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getOrder1() {
		return order1;
	}
	public void setOrder1(int order1) {
		this.order1 = order1;
	}
	public int getOrder2() {
		return order2;
	}
	public void setOrder2(int order2) {
		this.order2 = order2;
	}
	public int getOrder3() {
		return order3;
	}
	public void setOrder3(int order3) {
		this.order3 = order3;
	}
    
}
