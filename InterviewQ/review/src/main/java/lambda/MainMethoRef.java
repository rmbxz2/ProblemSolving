package lambda;

//import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainMethoRef {
	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		A a = (name) -> System.out.println(name);
		a.printName("ahmad");

		System.out.println("====================");
		A a1 = name -> B.printInfo(name);
		a1.printName("ali");
		// same as above, convert method ref to lambda expression by eclipse 
		A a2 = B::printInfo;
		a2.printName("omar");

		System.out.println("====================");
		C c1 = () -> new Dog();
		C c2 = Dog::new; // convert to lambda will be () -> new Dog()

		System.out.println("================");

		List<Dog> listDogs = new ArrayList<>();
		listDogs.add(new Dog("Dog4", 104, 1));
		listDogs.add(new Dog("Dog1", 101, 2));
		listDogs.add(new Dog("Dog3", 103, 4));
		listDogs.add(new Dog("Dog2", 102, 3));

		System.out.println("==========sort==================");

		//listDogs.sort((dog1,dog2) -> (dog1.getName()).compareTo(dog2.getName()));
		listDogs.sort(Comparator.comparing(Dog::getAge));
		listDogs.forEach(System.out::println);

		System.out.println("==========/sort==================");

		Consumer<Dog> consumer2 = (dog) -> System.out.println(dog);
		listDogs.forEach(consumer2);

		System.out.println("============================");
		List<String> listNames = Arrays.asList("ant", "cat", "bat", "dog");
		listNames.sort((s1, s2) -> s1.compareTo(s2));
		listNames.forEach(System.out::println);

		System.out.println("===sorted by name ==");
		listNames.sort(String::compareTo);
		listNames.forEach(System.out::println);


	}
}
