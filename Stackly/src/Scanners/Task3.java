package Scanners;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Year of Experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

//        double allowances = basicSalary * 40 / 100;
//        double hra = basicSalary * 20 / 100;
//
//        double grossPay = basicSalary + allowances + hra;
//
//        double pf = basicSalary * 12 / 100;
//
//        double netPay = grossPay - pf;
        double expIncreament=0;
        double deptIncreament=0;
        double bonus=0;
        
        if(experience>=2) {
        	expIncreament=basicSalary*10/100;
        }
        else if(experience>=5) {
        	expIncreament=basicSalary*15/100;
        	
        }
        else if(experience>=10) {
        	expIncreament=basicSalary*20/100;
        }
        
        if (department.equalsIgnoreCase("IT")) {
        	deptIncreament = basicSalary * 10 / 100;
        } 
        else if (department.equalsIgnoreCase("HR")) {
        	deptIncreament = basicSalary * 8 / 100;
        } 
        else if (department.equalsIgnoreCase("Finance")) {
        	deptIncreament = basicSalary * 7 / 100;
        }

        if (designation.equalsIgnoreCase("Manager")) {
            bonus = 5000;
        } 
        else if (designation.equalsIgnoreCase("Team Lead")) {
            bonus = 3000;
        } 
        else if (designation.equalsIgnoreCase("Developer")) {
            bonus = 2000;
        }
        
        double netAmount =basicSalary+expIncreament+deptIncreament+bonus;
                
        


        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Department : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Experience : " + experience + " years");
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("ExperienceIncreament :" +expIncreament);
        System.out.println("DepartmentIncreament :" +deptIncreament);
        System.out.println("Bonus :" +bonus);
        System.out.println("Net Amount :" +netAmount);
//        System.out.println("Allowances : " + allowances);
//        System.out.println("HRA : " + hra);
//        System.out.println("Gross Pay : " + grossPay);
//        System.out.println("PF : " + pf);
//        System.out.println("Net Pay: " + netPay);

        sc.close();

}
}
