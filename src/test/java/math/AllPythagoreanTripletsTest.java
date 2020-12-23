package math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static math.AllPythagoreanTriplets.pythagoreanPrimes;
import static math.AllPythagoreanTriplets.triplets;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllPythagoreanTripletsTest {
  @Test
  void all_triplets_returns_nested_array_three_numbers() {
    ArrayList<ArrayList<Integer>> triplets = triplets(15);
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>(asList(3, 4, 5)));
    result.add(new ArrayList<>(asList(5, 12, 13)));
    result.add(new ArrayList<>(asList(6, 8, 10)));
    assertEquals(result, triplets);
  }

  @Test
  void all_pythagorean_primes_below_15() {
    ArrayList<Integer> primes = pythagoreanPrimes(100);

    ArrayList<Integer> expected = new ArrayList<>(
        asList(5, 13, 17, 29, 37, 41, 53, 61, 73, 89, 97)
    );
    assertEquals(expected, primes);
  }
}
