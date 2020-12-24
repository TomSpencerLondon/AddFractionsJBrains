package math;

import org.junit.jupiter.api.Test;

import static math.BinaryConversion.toBinary;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryConversionTest {
  @Test
  void it_translates_decimal_to_binary() {
    String result = toBinary(42);
    assertEquals("101010", result);
  }
}
