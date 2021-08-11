package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
* Describe class here.
*
*
*
*
*
*/
public class DogQuerierDogQuerierImp {
	/**
	* 
	* @param args
	*/
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setAge(10);

		Dog dog2 = new Dog();
		dog2.setAge(8);

		Dog dog3 = new Dog();
		dog3.setAge(15);

		ArrayList<Dog> list = new ArrayList();
		list.add(dog);
		list.add(dog2);
		list.add(dog3);

		Dog dd = new Dog();
		dd.setAge(10);

		Comparator<Dog> compartor = (do1, do2) -> (Integer.valueOf(do1.getAge())).compareTo(do2.getAge());
		Collections.sort(list, compartor);
		System.out.println("search result =" + Collections.binarySearch(list, dd, compartor));

		//System.out.println("list = " + list.toString());
		list.forEach(System.out::println);

		// inner class 
		DogQuerier dogQuerier1 = new DogQuerier() {
			public boolean test(Dog d) {
				return d.getAge() > 9;
			}

		};
		System.out.println("result1  inner class = " + dogQuerier1.test(dog));

		DogQuerier dogQuerier2 = d2 -> d2.getAge() > 9;
		System.out.println("result2  lambda  = " + dogQuerier2.test(dog));

		DogQuerier dogQuerier3 = (Dog d3) -> d3.getAge() > 9;
		System.out.println("result3  lambda  = " + dogQuerier3.test(dog));

		DogQuerier dogQuerier4 = (Dog d4) -> d4.getAge() > 9;
		System.out.println("result4  lambda  = " + dogQuerier4.test(dog));

		DogQuerier dogQuerier5 = (Dog d5) -> { // if you adding  return must add braces also 
			return d5.getAge() > 9; // return with  {}
		};
		System.out.println("result5  lambda  = " + dogQuerier5.test(dog));

		DogQuerier dogQuerier6 = d6 -> d6.getAge() > 9;
		System.out.println("result6  lambda  = " + dogQuerier6.test(dog));
		// 
		//
		int numCats = 3;
		// final int numBaalls = 1;
		// must be final or effective final
		DogQuerier dqWithCats = d -> {
			int numBaalls = 1;
			numBaalls++;
			// numCats++; // cant change numCats 
			System.out.println("numBalls = " + numBaalls);
			System.out.println("numCats = " + numCats);
			return d.getAge() > 9;
		};

		dqWithCats.test(dog);

		//
		//use import java.util.function.Predicate; to test()
		// Predicate  methods are static or default except test, because Predicate is Functional @FunctionalInterface
		Predicate<Dog> predicate = d -> d.getAge() > 9;
		System.out.println("result predicate lambda = " + predicate.test(dog));

		//
		//
		System.out.println("====== supplier ============");
		Supplier<Integer> supplierInnerClass = new Supplier<>() {
			@Override
			public Integer get() {
				return 42;
			}
		};
		System.out.println("supplier get by inner class =" + supplierInnerClass.get());

		System.out.println("==================");

		Supplier<Integer> answerSupplier = () -> 42;
		System.out.println("supplier get by lambda = " + answerSupplier.get());

		System.out.println("==================");

		Supplier<String> userSupplier = () -> {
			Map<String, String> env = System.getenv();
			return env.get("USER");
		};
		// System.out.println(""+ System.getenv());
		System.out.println("userSupplier user " + userSupplier.get());

		System.out.println("==================");

		Random random = new Random();
		IntSupplier intSupplier = () -> random.nextInt(50);
		System.out.println("random = " + intSupplier.getAsInt());

		System.out.println("====== consumer pill ============");

		Consumer<String> consumerPill = (pill) -> {
			if (pill.equals("red")) {
				System.out.println("pill is red ");
			} else if (pill.equals("blue")) {
				System.out.println("pill is blue ");
			}
		};
		String pill = "blue";
		consumerPill.accept(pill);
		System.out.println("====== consumer int  ============");

		System.out.println("==================");

		Dog dog11 = new Dog(1, "dog1", 100);
		Dog dog22 = new Dog(2, "dog2", 200);
		Dog dog33 = new Dog(3, "dog3", 300);
		Dog dog44 = new Dog(4, "dog4", 400);
		List<Dog> listDog = new ArrayList<Dog>();
		listDog.add(dog11);
		listDog.add(dog22);
		listDog.add(dog33);
		listDog.add(dog44);
		Consumer<Dog> dogName = (Dog d) -> {
			System.out.print(d.getName());
		};

		Consumer<Dog> dogPark = (Dog d) -> {
			System.out.println(" " +d.park());
		};

		//		listDog.forEach(dogName.andThen(dogPark));
		listDog.forEach((Dog::getName));

	} // method end
}
