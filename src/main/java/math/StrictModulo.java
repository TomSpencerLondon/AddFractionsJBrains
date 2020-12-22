package math;

public class StrictModulo {
  public static int strictModulo(int n, int m){
    int r = n % m;
    if (r < 0){
      return r + m;
    }else{
      return r;
    }
  }

  public static int remainder(int n, int m){
    return n % m;
  }
}
