package math;

import org.junit.jupiter.api.Test;

import static math.SumNaturalNumbers.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNaturalNumbersTest {
  @Test
  void sums_numbers_below_input() {
    int sum = sum(5);
    assertEquals(15, sum);
  }
}
