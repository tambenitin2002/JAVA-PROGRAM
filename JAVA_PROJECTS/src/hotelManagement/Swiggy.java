package hotelManagement;

import java.util.Scanner;

public class Swiggy {
	
	Customer c;
	int quantity;
	int totalPrice=0;
	
	
	public Swiggy(int quantity) {
		super();
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	Scanner sc=new Scanner(System.in);
	
	public void placeOrder() {
		if(this.c==null) {
		System.out.println("Enetr the name");
		String cname=sc.next();
		System.out.println("Enetr the cno");
		long cno=sc.nextLong();
		System.out.println("Enetr the area");
		String area=sc.next();
		System.out.println("Enetr the order \n 1.Pav Bhaji $100 \n 2.Wada Pav $20 \n 3. Panir Masala  $150 \n 4. Biryani $70 \n 5.Nothing $0");
		int  order1=sc.nextInt();
		
		switch(order1) {
		case 1:
		{
			System.out.println("1.Pav Bhaji");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=100;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
			
		}
		break;
		case 2:
		{
			System.out.println("2.Wada Pav");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=20;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 3:
		{
			System.out.println("3. Panir Masala");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=150;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 4:
		{
			System.out.println("4. Biryani");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=70;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 5:
		{
			System.out.println("Nothing");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=0;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		default :
		{
			
			System.out.println("Invalid Order");
		}
		break;
		}
		
		System.out.println("Enetr the order \n 1.Pav Bhaji $100 \n 2.Wada Pav $20 \n 3. Panir Masala  $150 \n 4. Biryani $70 \n 5.Nothing $0");
		int  order2=sc.nextInt();
		
		switch(order2) {
		case 1:
		{
			System.out.println("1.Pav Bhaji");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=100;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 2:
		{
			System.out.println("2.Wada Pav");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=20;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 3:
		{
			System.out.println("3. Panir Masala");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=150;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 4:
		{
			System.out.println("4. Biryani");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=70;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 5:
		{
			System.out.println("5.Nothing");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=0;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		default :
		{
			System.out.println("Invalid Order");
		}
		break;
		}
		System.out.println("Enetr the order \n 1.Pav Bhaji $100 \n 2.Wada Pav $20 \n 3. Panir Masala  $150 \n 4. Biryani $70 \n 5.Nothing $0");
		int  order3=sc.nextInt();
		
		switch(order3) {
		case 1:
		{
			System.out.println("1.Pav Bhaji");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=100;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 2:
		{
			System.out.println("2.Wada Pav");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=20;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 3:
		{
			System.out.println("3. Panir Masala");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=150;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 4:
		{
			System.out.println("4. Biryani");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=70;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
		}
		break;
		case 5:
		{
			System.out.println("5. Nothing");
			System.out.println("Enter the Quantity ");
			int quantity=sc.nextInt();
			int price=0;
			int lprice=price*quantity;
			totalPrice=totalPrice+lprice;
			
		}
		break;
		default :
		{
			
			System.out.println("Invalid Order");
		}
		break;
		}
		
		this.c=new Customer(cname,cno,area,order1,order2,order3);
		
		}else {
			System.out.println("Already Order placed ! ");
		}
		
	}
public void cancelOrder() {
	if(this.c==null) {
		System.out.println("Order is not Placed...");
	}else {
		this.c=null;
	}
		
	}
public void update() {
	if(this.c==null) {
		System.out.println("Update in Order...");
	}else {
		System.out.println("What can you want to change \n 1. contact number \n 2. order location  ");
		int choose=sc.nextInt();
		switch (choose) {
		case 1: 
		{
			System.out.println("Enter the New Contact number ");
			long cno=sc.nextLong();
			c.setCno(cno);
			System.out.println("-----------------Contact Number Successfully Updated----------------------------");
		}
		break;
		case 2:
		{
			System.out.println("Enter the New Contact number ");
			String area=sc.next();
			c.setArea(area);
			System.out.println("-----------------Location Successfully Updated----------------------------");	
		}
		break;
		default:
		{
			System.out.println("Invalid Choice");
		}
		}
		}
	
}
public void display() {
	if(this.c==null) {
		System.out.println("Order is not Placed...");
	}else {
		System.out.println("Customer Name: "+c.getCname());
		System.out.println("Customer Contact Number : "+c.getCno());
		System.out.println("Location : "+c.getArea());
		System.out.println(" Order  "+c.getOrder1()+"\n"+c.getOrder2()+"\n"+c.getOrder3());
		System.out.println("Total Price is "+totalPrice);
		
	}
		
	}
	
}



