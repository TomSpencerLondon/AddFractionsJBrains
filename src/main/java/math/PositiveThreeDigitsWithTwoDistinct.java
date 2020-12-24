package math;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class PositiveThreeDigitsWithTwoDistinct {
  public static int count() {
    int count = 0;
    for (int i = 100; i < 1000; i++){
      if (hasTwoDistinctDigits(i)){
        count++;
      }
    }
    return count;
  }

  public static boolean hasTwoDistinctDigits(int number) {
      int firstDigit = number / 100;
      int secondDigit = number / 10 % 10;
      int thirdDigit = number / 1 % 10;
      if (new HashSet<>(asList(firstDigit, secondDigit, thirdDigit)).size() == 2) {
        return true;
      }
    return false;
  }
}
