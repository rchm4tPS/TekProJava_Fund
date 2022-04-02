
public class ManagerTest {
	public static void main (String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		
		int i;
		for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++) staff[i].print();
		
		// Check manager object
		Manager[] a = new Manager[4];
		a[0] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
		a[1] = new Manager("Linda Bianchi", 2500000, 1, 12, 1991);
		a[2] = new Manager("Giulio Rossi", 3500000, 1, 10, 1994);
		a[3] = new Manager("Emma Verdi", 3100000, 1, 11, 1992);
		
		Sort.shell_sort(a);
		for (i = 0; i <= 3; i++) a[i].print();
	}
	
	
}