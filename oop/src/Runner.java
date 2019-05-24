
public class Runner {

	public static void main(String[] args) {

		Person thomas = new Person("Thomas", 21, "Baker");
		Person alice = new Person("Alice", 40, "Firefighter");
		Person bob = new Person("Bob", 30, "Nurse");

		// thomas.description();
		System.out.println(thomas.description());
		System.out.println(alice.description());
		System.out.println(bob.description());

		// toString()
		PersonManager pm1 = new PersonManager();
		// pm1.personList.add(thomas);
		// pm1.personList.add(alice);
		// pm1.personList.add(bob);

		pm1.getPersonList().add(thomas);
		pm1.getPersonList().add(alice);
		pm1.getPersonList().add(bob);

	}

}
