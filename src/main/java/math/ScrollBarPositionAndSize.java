package math;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class ScrollBarPositionAndSize {
  public static ArrayList<Integer> currentPosition(int numberOfCharactersInText, int characterPosition) {
    int heightOfWindow = 784;
    int widthOfWindow = 1366;
    int numberOfCharactersPerWindow = 1200;
    int scrollBarSize = heightOfWindow * (numberOfCharactersPerWindow / numberOfCharactersInText);
//    if (scrollBarSize > heightOfWindow){
//      scrollBarSize = heightOfWindow;
//    }
//
//    if (scrollBarSize < 20){
//      scrollBarSize = 20;
//    }

    return new ArrayList<Integer>(asList(scrollBarSize, 1));
  }
}
