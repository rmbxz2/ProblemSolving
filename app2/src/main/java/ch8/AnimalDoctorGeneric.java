package ch8;

import java.util.List;

/**
 * Describe class AnimalDoctorGeneric here.
 *
 *
 * Created: Wed Nov  1 18:44:27 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class AnimalDoctorGeneric {

  public void addAnimal(List<? super Dog> animals) {
      animals.add(new Dog());
      //      animals.add(new Animal());
  }
}
