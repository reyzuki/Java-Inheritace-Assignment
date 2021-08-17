
public class Q2 {
	static class Member{
		String name;
		int age;
		String number;
		String address;
		int salary;
		
		public void printSalary() {
			System.out.println(salary);
		}
	}
	static class Employee extends Member{
		String specialization;
	}
	
	static class Manager extends Member{
		String department;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Daniel";
		e.age = 21;
		e.number = "0244541701";
		e.address = "dan@gmail.com";
		e.salary = 5600;
		e.specialization = "Java programming";
		
		Manager m = new Manager();
		m.name = "Boakye";
		m.age = 34;
		m.number = "0556221701";
		m.address = "boakye@gmail.com";
		m.salary = 9500;
		m.department = "HR";
		
		e.printSalary();
		m.printSalary();
		
	}

}
