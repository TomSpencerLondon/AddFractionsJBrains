package math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static math.CleverClock.newHoursAndMinutes;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CleverClockTest {
  @Test
  void add_returns_array_of_new_hours_and_new_minutes() {
    ArrayList<Integer> newHoursAndMinutes = newHoursAndMinutes(10, 30, 3, 45);

    assertEquals(new ArrayList<>(asList(2, 15)), newHoursAndMinutes);
  }
}
