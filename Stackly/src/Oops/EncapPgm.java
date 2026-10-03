package Oops;

public class EncapPgm {

	public static void main(String[] args) {
		Patient p=new Patient();
		p.setPatientId(101);
		p.setPatientName("RajaDurai");
		p.setAge(27);
		p.setDesease("Viral Fever");
		p.setDoctorFees(1000);
		p.setMedicineFees(2500);
		p.setRoomFees(1500);
		
		p.display();

	}

}

class Patient{
	
	private int patientId;
	private String patientName;
	private int age;
	private String desease;
	private int doctorFees;
	private int roomFees;
	private int medicineFees;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesease() {
		return desease;
	}
	public void setDesease(String desease) {
		this.desease = desease;
	}
	public int getDoctorFees() {
		return doctorFees;
	}
	public void setDoctorFees(int doctorFees) {
		this.doctorFees = doctorFees;
	}
	public int getRoomFees() {
		return roomFees;
	}
	public void setRoomFees(int roomFees) {
		this.roomFees = roomFees;
	}
	public int getMedicineFees() {
		return medicineFees;
	}
	public void setMedicineFees(int medicineFees) {
		this.medicineFees = medicineFees;
	}
	
	public double calculateTotal() {
		return doctorFees+roomFees+medicineFees;
	}
	
	public void display() {
		System.out.println("............Hospital Bill...........");
		System.out.println("Patient ID :"+patientId);
		System.out.println("Patient Name :"+patientName);
		System.out.println("Patient Age :"+age);
		System.out.println("Disease :"+desease);
		System.out.println("Doctor Fees : ₹ "+doctorFees);
		System.out.println("RoomFees : ₹ "+roomFees);
		System.out.println("Medical Fees : ₹ "+medicineFees);
		System.out.println("Total Bill : ₹ "+calculateTotal());
	}
}
