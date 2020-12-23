package math;

public class NumberOfDigits {
  public static int digits(int number) {
    int result = 0;
    if (number > 9999) {
      throw new Error("Number is too large");
    }
    if (number > 999) {
      result = 4;
    } else if (number > 99) {
      result = 3;
    } else if (number > 9) {
      result = 2;
    } else if (number > 0) {
      result = 1;
    }

    return result;
  }
}
