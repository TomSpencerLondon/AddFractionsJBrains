package math;

import org.junit.jupiter.api.Test;

import static math.PositiveThreeDigitsWithTwoDistinct.count;
import static math.PositiveThreeDigitsWithTwoDistinct.hasTwoDistinctDigits;
import static org.junit.jupiter.api.Assertions.assertEquals;

// How many positive three-digit numbers contain
// exactly two distinct digits
// (e.g., 343 or 772, but not 589 or 111)?
public class PositiveThreeDigitsWithTwoDistinctTest {
  @Test
  void returns_true_for_two_distinct() {
    boolean result = hasTwoDistinctDigits(662);
    assertEquals(true, result);
  }

  @Test
  void returns_count_for_distinct_digits() {
    int count = count();
    assertEquals(243, count);
  }
}
