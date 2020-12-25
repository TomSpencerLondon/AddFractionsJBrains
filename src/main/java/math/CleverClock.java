package math;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static math.StrictModulo.strictModulo;

public class CleverClock {
  public static ArrayList<Integer> newHoursAndMinutes(int oldHours, int oldMinutes, int addHours, int addMinutes){
    int newMinutes = strictModulo(oldMinutes + addMinutes, 60);
    int newHours = 1 + strictModulo(oldHours + addHours, 12);
    return new ArrayList<Integer>(asList(newHours, newMinutes));
  }
}
