package studentProject;

public class Student {
	 private String sname;
	 private int id;
	 private String std;
	 
	public void setStd(String std) {
		this.std = std;
	}
	public String getSname() {
		return sname;
	}
	public int getId() {
		return id;
	}
	public String getStd() {
		return std;
	}
	public Student(String sname, int id, String std) {
		super();
		this.sname = sname;
		this.id = id;
		this.std = std;
	}
	
}
