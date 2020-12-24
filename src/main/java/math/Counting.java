package math;

import java.util.HashSet;

public class Counting {
  public static int countNumbers() {
    int totalCount = 0;
    for (int i = 1000; i < 10000; i++) {
      if (i % 3 == 0 && i % 100 == 23) {
        int firstDigit = i / 1000;
        int secondDigit = i / 100 % 10;
        HashSet<Integer> digits = new HashSet();
        digits.add(firstDigit);
        digits.add(secondDigit);
        if (!digits.contains(2) && !digits.contains(3) && digits.size() == 2){
          totalCount++;
        }
      }
    }

    return totalCount;
  }
}
