package lectures;


import org.junit.Test;

import java.util.Arrays;
import java.util.function.Predicate;

public class findAnyFindFirst {

  final Predicate<Integer> numbersGreaterFiveLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int any = Arrays.stream(numbers)
        .filter(numbersGreaterFiveLessThan10)
        .findAny()
        .get();
    System.out.println(any);
  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int first = Arrays.stream(numbers)
        .filter(numbersGreaterFiveLessThan10)
        .findFirst()
        .get();
    System.out.println(first);
  }
}

