package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCMTest {
  @Test
  void returns_lowest_common_multiple() {
    int lcm = new LCM().lcm(4, 3);
    assertEquals(12, lcm);
  }
}
