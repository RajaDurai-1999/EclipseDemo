package Oops;

public class DataAbstactPgm {
	 public static void main(String[] args) {

	        Doctor doctor1 = new GeneralDoctor("Arun", 101);

	        doctor1.displayDoctorDetails();
	        doctor1.treatPatient();

	        System.out.println("--------------------------");

	        Doctor doctor2 = new Cardiologist("Kumar", 102);

	        doctor2.displayDoctorDetails();
	        doctor2.treatPatient();

	        System.out.println("--------------------------");

	        Doctor doctor3 = new Dentist("Priya", 103);

	        doctor3.displayDoctorDetails();
	        doctor3.treatPatient();
	    }

}
abstract class Doctor {
    String doctorName;
    int doctorId;
    
    Doctor(String doctorName, int doctorId) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
    }
    abstract void treatPatient();
    
    void displayDoctorDetails() {
        System.out.println("Doctor ID   : " + doctorId);
        System.out.println("Doctor Name : " + doctorName);
    }
}
class GeneralDoctor extends Doctor {

    GeneralDoctor(String doctorName, int doctorId) {
        super(doctorName, doctorId);
    }

    @Override
    void treatPatient() {
        System.out.println("Treatment   : General health check-up");
        System.out.println("Prescription: Basic medicines");
    }
}
class Cardiologist extends Doctor {

    Cardiologist(String doctorName, int doctorId) {
        super(doctorName, doctorId);
    }

    @Override
    void treatPatient() {
        System.out.println("Treatment   : Heart examination");
        System.out.println("Prescription: Heart-related medicines");
    }
}
class Dentist extends Doctor {

    Dentist(String doctorName, int doctorId) {
        super(doctorName, doctorId);
    }

    @Override
    void treatPatient() {
        System.out.println("Treatment   : Dental examination");
        System.out.println("Prescription: Dental medicines");
    }
}
