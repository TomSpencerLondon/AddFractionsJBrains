package math;

public class LCM {
  int lcm(int n, int m){
    return n * m / new GCD().gcd(n, m);
  }
}
