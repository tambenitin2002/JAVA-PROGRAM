package bankManagement;

import java.util.Scanner;

public class Bank {
	private String bankName;
	private String branch;
    Account a;
	public Bank(String bankName, String branch) {
		super();
		this.bankName = bankName;
		this.branch = branch;
	}
	public String getBankName() {
		return bankName;
	}
	public String getBranch() {
		return branch;
	}
	Scanner sc=new Scanner(System.in);
	
	public  void createAccount() {
		if(this.a==null) {
	
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		System.out.println("Enter the Account Holder name ");
		String name=sc.next();
		System.out.println("Enter the Account Number ");
		long acno=sc.nextLong();
		System.out.println("Enter the IFSC Code ");
		String ifsc=sc.next();
		System.out.println("Enter the Balance Amount ");
		int bal=sc.nextInt();
		System.out.println(" Enter The Contact Number ");
		long cont=sc.nextLong();
		System.out.println("Enter the City: ");
		String city=sc.next();
		this.a=new Account(pin, name,acno,ifsc,bal,cont,city);
		System.out.println("------------Detail Featch Successfully-----------------");
		}else {
			System.out.println("Account is Already Created");
		}
		
	}
	public void deleteAccount()
	{
		if(this.a==null) {
			System.out.println("The Account is not Created yet...");
		}else {
			System.out.println("Entr the pin");
			int pin=sc.nextInt();
			if(pin==a.getPin()) {
				this.a=null;
				
				System.out.println("------------Account Delete  Successfully-----------------");
			}else {
				System.out.println("Incorrect Pin..");
			}
		}
	}
	public void accountDetails() {
		if(this.a==null) {
			System.out.println("The Account is not Created Yet....");
		}else {
			System.out.println("Entr the pin");
			int pin=sc.nextInt();
			if(pin==a.getPin()) {
				System.out.println("-----------"+bankName+"----------");
				System.out.println("Branch Name is: "+branch);
				System.out.println("The Account Holder Name : "+a.getName());
				System.out.println("Account Number is:  "+a.getAcno());
				System.out.println("IFSC Code is: "+a.getIfsc());
				System.out.println(" Account Balance : "+a.getBal());
				System.out.println("Contact Number: "+a.getCont());
				System.out.println("City: "+a.getCity());
				
				System.out.println("------------Detail Featch Successfully-----------------");
				
			}else {
				System.out.println("Incorrect Pin..");
			}
		}
	}
	public void updateDetails() {
		
		if(this.a==null) {
			System.out.println("The Account is not Created Yet....");
		}else {
			System.out.println("Entr the pin");
			int pin=sc.nextInt();
			if(pin==a.getPin()) {
				System.out.println("Enter the Updating contact number ");
				long cont=sc.nextLong();
				a.setCont(cont);
				System.out.println("Contact is update successfully...... ");
				
				System.out.println("Enter the Updating City number ");
				String city=sc.next();
				a.setCity(city);
				System.out.println("City is update successfully...... ");
				
				System.out.println("------------Detail Update Successfully-----------------");
			}else {
				System.out.println("Incorrect Pin");
			}
		}
	}
	
	public void withdraw() {
		if(this.a==null) {
			System.out.println("The Account is not Created Yet....");
		}else {
			System.out.println("Entr the pin");
			int pin=sc.nextInt();
			if(pin==a.getPin()) {
				System.out.println("Enter the Withdraw Amount ");
				int amount=sc.nextInt();
				if(a.getBal()>=amount) {
				int bal=a.getBal()-amount;
				a.setBal(bal);
				
				System.out.println("------------Withdraw Successfully-----------------");
				}else {
					System.out.println("Insufficiant Money...");
				}
			}else {
				System.out.println("Incorrect Pin");
			}
		}
	}
	
	public void deposite() {
		if(this.a==null) {
			System.out.println("The Account is not Created Yet....");
		}else {
			System.out.println("Entr the pin");
			int pin=sc.nextInt();
			if(pin==a.getPin()) {
				System.out.println("Enter the Deposite Amount ");
				int amount=sc.nextInt();
				int bal=a.getBal()+amount;
				a.setBal(bal);
				System.out.println("------------Deposite Successfully-----------------");
				}else {
				System.out.println("Incorrect Pin");
			}
		
		}
	}
	
	public void checkBalance() {
		if(this.a==null) {
			System.out.println("The Account is not Created Yet....");
		}else {
			System.out.println("Entr the pin");
			int pin=sc.nextInt();
			if(pin==a.getPin()) {
				System.out.println("Current balance is "+a.getBal());
				
				System.out.println("------------Balance Featch Successfully-----------------");
				
			}
		}
	}
	public void changePin() {
		if(this.a==null) {
			System.out.println("The Account is not Created Yet....");
		}else {
			System.out.println("Entr the pin");
			int pin=sc.nextInt();
			if(pin==a.getPin()) {
				System.out.println("Enter the the old pin ");
				int oldpin=sc.nextInt();
				if(oldpin==a.getPin()) {
					System.out.println("Enter New Pin ");
					int newpin=sc.nextInt();
					a.setName(newpin);
					
					System.out.println("------------Pin Change Successfully-----------------");
				}
			}
		}
	}
	
    
}

