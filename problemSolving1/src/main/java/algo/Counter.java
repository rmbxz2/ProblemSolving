package algo;

/**
 * Describe class here.
 *
 *
 *
 *
 *
 */
public class Counter {

  public static void main(String[] args) {

    for (int index = 0; index < 10; index++) {
      if (index == 2)
        continue;
      System.out.println(index);
    }
  }
}
