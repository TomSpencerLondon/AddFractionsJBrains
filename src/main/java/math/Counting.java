package math;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class Counting {

  public static final int THIRD_DIGIT = 2;
  public static final int FOURTH_DIGIT = 3;

  public static int countNumbers() {
    int totalCount = 0;
    for (int i = 1000; i < 10000; i++) {
      if (i % 3 == 0 && i % 100 == 23) {
        int firstDigit = i / 1000;
        int secondDigit = i / 100 % 10;
        HashSet<Integer> digits = new HashSet(asList(firstDigit, secondDigit, THIRD_DIGIT, FOURTH_DIGIT));
        if (digits.size() == 4){
          totalCount++;
        }
      }
    }

    return totalCount;
  }
}
