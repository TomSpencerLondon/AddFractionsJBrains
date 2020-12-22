package math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ListOfPrimesTest {
  @Test
  void returns_a_list_of_primes_to_m() {
    int[] list = new ListOfPrimes(9).list();
    int[] result = {2, 3, 5, 7};

    Arrays.equals(result, list);
  }
}
