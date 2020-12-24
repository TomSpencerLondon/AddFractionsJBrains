package math;

import org.junit.jupiter.api.Test;

import static math.Counting.countNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

//How many distinct four-digit numbers are divisible by 3
// and have 23 as their last two digits?
public class CountingTest {
  @Test
  void returns_count_of_distinct_four_digit_numbers_divisible_by_three_and_last_two_digits_23() {
    int count = countNumbers();

    assertEquals(17, count);
  }
}
