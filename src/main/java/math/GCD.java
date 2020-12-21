package math;

public class GCD {
  int gcd(int n, int m){
    int remainder = n % m;
    if (remainder == 0){
      return m;
    }

    return gcd(m, remainder);
  }
}
