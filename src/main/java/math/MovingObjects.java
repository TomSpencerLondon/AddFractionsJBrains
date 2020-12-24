package math;

public class MovingObjects {

  public static int count(double height) {
    double currentHeight = height;
    int count = 0;
    while(currentHeight > 0.5) {
      currentHeight = currentHeight * 2 / 3;
      count++;
    }
    return count;
  }

}
