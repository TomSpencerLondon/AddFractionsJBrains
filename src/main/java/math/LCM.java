package math;

import static math.GCD.gcd;

public class LCM {
  static int lcm(int n, int m){
    return n * m / gcd(n, m);
  }
}
