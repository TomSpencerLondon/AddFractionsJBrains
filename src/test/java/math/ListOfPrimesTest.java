package math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static math.ListOfPrimes.*;

public class ListOfPrimesTest {
  @Test
  void returns_a_list_of_primes_to_m() {
    int[] list = new ListOfPrimes(9).list();
    int[] result = {2, 3, 5, 7};

    Arrays.equals(result, list);
  }

  @Test
  void returns_list_of_primes() {
    int[] list = list(9);
    int[] result = {2, 3, 5, 7};

    Arrays.equals(result, list);
  }

  @Test
  void returns_prime_factors() {
    int[] list = primes(20);

    int[] result = {2, 5};

    Arrays.equals(result, list);
  }
}
