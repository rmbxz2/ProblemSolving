package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import static java.util.Comparator.comparing;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainLambda {
	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {

		DogQuerier dogQuerier = new DogQuerier() {

			@Override
			public boolean test(Dog d) {
				return d.getAge() > 9;
			}
		};

		Dog d = new Dog("dog1", 110, 8);
		System.out.println("dog age > 9  = " + dogQuerier.test(d));

		System.out.println("============================");
		int sum = 0;
		DogQuerier dogQuerier2 = d2 -> {
			System.out.println(sum);
			return d2.getAge() > 9;
		};
		Dog d2 = new Dog("dog1", 110, 8);
		System.out.println("dog age > 9 " + dogQuerier2.test(d2));

		System.out.println("============================");

		Supplier<Dog> supplier1 = () -> new Dog("dog1", 22, 8);
		Supplier<Dog> supplier2 = () -> {
			return new Dog("dog2", 33, 9);
		};

		System.out.println("supplier1 get " + supplier1.get());
		System.out.println("supplier2 get " + supplier2.get());

		System.out.println("============================");

		Consumer<Dog> consumer1 = (Dog d4) -> {
			System.out.println("consumer dog4 =" + d4);
		};

		Dog d4 = new Dog("dog4", 112, 99);
		consumer1.accept(d4);

		System.out.println("============================");

		List<Dog> listDogs = new ArrayList<>();
		listDogs.add(new Dog("Dog4", 104, 1));
		listDogs.add(new Dog("Dog1", 101, 2));
		listDogs.add(new Dog("Dog3", 103, 4));
		listDogs.add(new Dog("Dog2", 102, 3));

		System.out.println("==========sort==================");

		//listDogs.sort((dog1,dog2) -> (dog1.getName()).compareTo(dog2.getName()));
		listDogs.sort(comparing(Dog::getAge));
		listDogs.forEach(System.out::println);

		System.out.println("==========/sort==================");

		Consumer<Dog> consumer2 = (dog) -> System.out.println(dog);
		listDogs.forEach(consumer2);

		System.out.println("=============// three type of prints are same===============");

		listDogs.forEach((dog) -> System.out.println(dog));

		listDogs.forEach(System.out::println);

		for (Dog dog : listDogs) {
			System.out.println(dog);
		}

		System.out.println("============================");

		Predicate<Dog> predicate1 = (dog2) -> dog2.getAge() > 90;
		System.out.println("predicate 4 =  " + predicate1.test(d4));

		System.out.println("============================");
		Function<Dog, Integer> function1 = (dog) -> {
			return dog.getAge();
		};
		System.out.println("function1 = " + function1.apply(d2));

		System.out.println("============================");

		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				for (int index = 0; index < 10; index++) {
					System.out.println(index);

				}
			}
		};

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable1);
		Thread thread3 = new Thread(runnable1);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
