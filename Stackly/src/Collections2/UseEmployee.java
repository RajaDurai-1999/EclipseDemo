package Collections2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class UseEmployee {

    public static void main(String[] args) {
    	Employee e=new Employee(100,"Raja",40000,26,true,3);
    	Employee e1=new Employee(101,"Bala",45000,28,true,4);
    	Employee e2=new Employee(102,"Kamali",50000,26,false,3);
    	Employee e3=new Employee(103,"Rajan",60000,26,true,3);
    	Employee e4=new Employee(104,"Kumar",65000,29,true,4);

    	HashMap<Integer, Employee> emp=new HashMap<>();

        emp.put(e.getId(), e);
        emp.put(e1.getId(), e1);
        emp.put(e2.getId(), e2);
        emp.put(e3.getId(), e3);
        emp.put(e4.getId(), e4);

        System.out.println(".......Original Map.........");
        System.out.println(emp);

        System.out.println("............Get Employee 100.........");

        System.out.println(emp.get(100));

        System.out.println("..........Contains Key.......");

        System.out.println(emp.containsKey(100));
        System.out.println(emp.containsKey(999));

        System.out.println("..........Contains Value..........");

        System.out.println(emp.containsValue(e));

        System.out.println("...............Size...........");

        System.out.println(emp.size());


        System.out.println("........Keys.........");

        System.out.println(emp.keySet());


        System.out.println(".......Values..........");

        System.out.println(emp.values());


        System.out.println(".....Entries........");

        System.out.println(emp.entrySet());


        System.out.println("..........KeySet + For Loop.......");

        for (Integer id : emp.keySet()) {

            System.out.println(
                    id + " -> " + emp.get(id)
            );
        }


        System.out.println("\nValues + For Loop");

        for (Employee x : emp.values()) {

            System.out.println(x);
        }

        System.out.println(".......EntrySet + For Loop....");

        for (Map.Entry<Integer, Employee> entry
                : emp.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue()
            );
        }


        System.out.println(".......Male Employees........");

        for (Employee x : emp.values()) {

            if (x.getisGender() == true) {

                System.out.println(x);
            }
        }


        System.out.println("...........Female Employees...........");

        for (Employee x : emp.values()) {

            if (x.getisGender() == false) {

                System.out.println(x);
            }
        }


        System.out.println("............Salary > 50000...........");

        for (Employee x : emp.values()) {

            if (x.getSalary() > 50000) {

                System.out.println(x);
            }
        }


        System.out.println("...........Male + Salary > 50000..........");

        for (Employee x : emp.values()) {

            if (x.getisGender()
                    && x.getSalary() > 50000) {

                System.out.println(x);
            }
        }


        System.out.println("...........Increase Male Salary by 10%..........");

        for (Employee x : emp.values()) {

            if (x.getisGender()) {

                int salary = x.getSalary();

                int increase = salary * 10 / 100;

                x.setSalary(salary + increase);
            }
        }

        System.out.println(emp);


        System.out.println("...........Lambda + values()...........");

        emp.values().forEach(x -> {

            System.out.println(x);

        });


        System.out.println("........Lambda + keySet()..........");

        emp.keySet().forEach(id -> {

            System.out.println(
                    id + " -> " + emp.get(id)
            );

        });


        System.out.println(".............Lambda + entrySet().........");

        emp.entrySet().forEach(entry -> {

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue()
            );

        });


        System.out.println("\nLast Character");

        emp.values().forEach(x -> {

            String name = x.getName();

            char last =
                    name.charAt(name.length() - 1);

            System.out.println(
                    name + " -> " + last
            );
        });


        System.out.println("\nMaximum Salary");

        Employee max =
                emp.get(e.getId());

        for (Employee x : emp.values()) {

            if (x.getSalary() > max.getSalary()) {

                max = x;
            }
        }

        System.out.println(
                "Maximum Salary Employee = " + max
        );


        System.out.println("\nMinimum Salary");

        Employee min =
                emp.get(e.getId());

        for (Employee x : emp.values()) {

            if (x.getSalary() < min.getSalary()) {

                min = x;
            }
        }

        System.out.println(
                "Minimum Salary Employee = " + min
        );

        System.out.println("\nIterator");

        Iterator<Employee> it =
                emp.values().iterator();

        while (it.hasNext()) {
            Employee x = it.next();

            System.out.println(x);
        }


        System.out.println("\nRemove Female");

        Iterator<Employee> removeIterator =
                emp.values().iterator();

        while (removeIterator.hasNext()) {

            Employee x =
                    removeIterator.next();

            if (!x.getisGender()) {

                removeIterator.remove();
            }
        }

        System.out.println(emp);


        System.out.println("\nputIfAbsent()");

        emp.putIfAbsent(105,
                new Employee(
                        105,
                        "Arun",
                        55000,
                        27,
                        true,
                        2
                ));

        System.out.println(emp);


        System.out.println("\ngetOrDefault()");

        System.out.println(
                emp.getOrDefault(100, null)
        );

        System.out.println(
                emp.getOrDefault(999, null)
        );


        System.out.println("\nStream - Male Employees");

        emp.values()
                .stream()
                .filter(x -> x.getisGender())
                .forEach(System.out::println);

        System.out.println("\nStream - Salary > 50000");

        emp.values()
                .stream()
                .filter(x -> x.getSalary() > 50000)
                .forEach(System.out::println);


        System.out.println("\nTotal Salary");

        int totalSalary =
                emp.values()
                        .stream()
                        .mapToInt(x -> x.getSalary())
                        .sum();

        System.out.println(
                "Total Salary = " + totalSalary
        );
    }
}

class Employee {
	private int id;
	private String name;
	private int salary;
	private int age;
	private boolean isGender;
	private int exp;
	public Employee(int id, String name, int salary, int age, boolean isGender, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.isGender = isGender;
		this.exp = exp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getisGender() {
		return isGender;
	}
	public void setisGender(boolean isGender) {
		this.isGender = isGender;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", isGender="
				+ isGender + ", exp=" + exp + "]";
	}
	
	

}
