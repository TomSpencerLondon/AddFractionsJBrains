package math;

public class BinaryConversion {
  public static String toBinary(int number) {
    String s = "";
    while (number > 0)
    {
      s =  String.format("%s%s", ( (number % 2 ) == 0 ? "0" : "1"), s);
      number = number / 2;
    }
    return s;
  }
}
