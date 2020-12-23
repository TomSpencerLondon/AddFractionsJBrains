package math;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class AllPythagoreanTriplets {
  public static ArrayList<ArrayList<Integer>> triplets(int number) {
    int count = 0;
    ArrayList result = new ArrayList();

    for (int a = 1; a < number; a++) {
      for (int b = a; b < number; b++) {
        for (int c = b; c < number; c++) {
          if (a * a + b * b == c * c) {
            result.add(asList(a, b, c));
            count++;
          }
        }
      }
    }
    return result;
  }
}
