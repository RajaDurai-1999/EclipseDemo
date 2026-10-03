package EnumCl;

enum Role{
	DEVELOPER("java developer",50000),
	TESTING("Software Testing",60000),
	MANAGER("Project Manager",70000);


String role;
int salary;

Role(String ro, int sal){
	role=ro;
	salary=sal;
	
}

public String getRole() {
	return role;
}

public int getSalary() {
	return salary;
}

}

public class EnumPgm3 {
	

	public static void main(String[] args) {
		
		Role r=Role.DEVELOPER;
		
		System.out.println(r.getRole());
		System.out.println(r.getSalary());


	}

}
