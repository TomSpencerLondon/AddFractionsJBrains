package math;

import org.junit.jupiter.api.Test;

public class ListOfPrimesTest {
  @Test
  void returns_a_list_of_primes_to_m() {
    new ListOfPrimes(15).list();
  }
}
