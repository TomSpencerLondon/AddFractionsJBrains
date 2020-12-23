package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.StrictMath.sqrt;
import static java.util.Arrays.asList;

//m and n have opposite parity – i.e. if one is odd, the other must be even.
//    m and n are coprime – i.e. they have no common integer factors greater than 1.

// random number and n is a random number
// a = m^2 - n^2, b = 2mn and c = m^2 + n^2
public class AllPythagoreanTriplets {
  public static ArrayList<ArrayList<Integer>> triplets(int number) {
    int count = 0;
    ArrayList result = new ArrayList();

    for (int a = 1; a < number; a++) {
      for (int b = a; b < number; b++) {
        double c = sqrt((a * a) + (b * b));
        if (c < number && (c % 1 == 0)) {
          List<Integer> list = asList((int) a, (int) b, (int) c);
          Collections.sort(list);
          result.add(list);
        }
      }

    }

    return result;
  }
}