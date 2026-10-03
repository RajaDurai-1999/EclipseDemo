package Oops;

public class CabBookingSystem {
	public static void main(String[]args) {
	CabBooking cab;
	
	cab=new MiniVan("Raja",20);
	cab.bookCab();
	cab.calculateFare();
	cab.displayBooking();
	
	System.out.println();
	
	cab=new SedanCab("Durai",25);
	cab.bookCab();
	cab.calculateFare();
	cab.displayBooking();
	

}
}

 class MiniVan implements CabBooking{
	String customerName;
	double distance;
	double fare;
	public MiniVan(String customerName, double distance) {
		this.customerName = customerName;
		this.distance = distance;
	}
	@Override
	public void bookCab() {
		System.out.println("MiniCab Booked Successfully");
		
	}
	@Override
	public void calculateFare() {
		fare=distance*15;		
	}
	@Override
	public void displayBooking() {
		System.out.println(".............MiniCab................");
		System.out.println("Customer Name : "+customerName);
		System.out.println("Distance : "+distance+" km");
		System.out.println("Fare : ₹ "+fare);
		
	}
  
	
}

 class SedanCab implements CabBooking{
	String customerName;
	double distance;
	double fare;
	public SedanCab(String customerName, double distance) {
		this.customerName = customerName;
		this.distance = distance;
	}
	@Override
	public void bookCab() {
		System.out.println("SedanCab Booked Successfully");
		
	}
	@Override
	public void calculateFare() {
		fare=distance*20;		
	}
	@Override
	public void displayBooking() {
		System.out.println(".............SedanCab................");
		System.out.println("Customer Name : "+customerName);
		System.out.println("Distance : "+distance+" km");
		System.out.println("Fare : ₹ "+fare);
		
	}
  
	
}
