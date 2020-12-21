package math;

import org.junit.jupiter.api.Test;

import static math.GCD.gcd;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {

  @Test
  void returns_correct_greatest_common_denominator() {
    int gcd = gcd(30, 50);
    assertEquals(10, gcd);
  }
}
