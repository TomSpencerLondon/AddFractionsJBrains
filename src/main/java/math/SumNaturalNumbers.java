package math;

public class SumNaturalNumbers {
  public static int sum(int sum){
    int result = 0;
    for (int i = 0; i <= sum; i++){
      result += i;
    }

    return result;
  }
}
