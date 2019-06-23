package lectures;


import org.junit.Test;

import java.util.Arrays;

public class reduce {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};

    // identity 0 is passed into a, ...
    int sum = Arrays.stream(integers).reduce(0, (a, b) -> a + b);
    System.out.println(sum);

    int sum2 = Arrays.stream(integers).reduce(0, Integer::sum);
    System.out.println(sum2);

  }


}

