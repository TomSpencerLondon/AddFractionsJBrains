package math;

import org.junit.jupiter.api.Test;

import static math.NumberOfDigits.digits;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberOfDigitsTest {

  @Test
  void returns_number_of_digits() {
    int digits = digits(1000);

    assertEquals(4, digits);
  }
}
