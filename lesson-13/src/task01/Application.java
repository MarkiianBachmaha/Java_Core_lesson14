package task01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		System.out.println("Before sorting:");

		Set<Person> set = new HashSet<Person>();
		set.add(new Person("Arturo", 47));
		set.add(new Person("Peter", 32));
		set.add(new Person("Jules", 15));
		set.add(new Person("Victor", 69));
		set.add(new Person("Taras", 20));

		for (Person person : set) {
			System.out.println(person);
		}

		System.out.println();

		Set<Person> set2 = new TreeSet<Person>();
		set2.add(new Person("Arturo", 47));
		set2.add(new Person("Peter", 32));
		set2.add(new Person("Jules", 15));
		set2.add(new Person("Victor", 69));
		set2.add(new Person("Taras", 20));

		for (Person person : set2) {
			System.out.println(person);
		}

		System.out.println();
		System.out.println("After sorting:");

		Set<Person> set1 = new TreeSet<Person>(new PersonComparator());
		set1.add(new Person("Arturo", 47));
		set1.add(new Person("Peter", 32));
		set1.add(new Person("Jules", 15));
		set1.add(new Person("Victor", 69));
		set1.add(new Person("Taras", 20));

		for (Person person : set1) {
			System.out.println(person);
		}

	}

}