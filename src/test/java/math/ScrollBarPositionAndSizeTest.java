package math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static math.ScrollBarPositionAndSize.currentPosition;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrollBarPositionAndSizeTest {
  @Test
  void returns_correct_position_and_size() {
    int numberOfCharactersInText = 1000;
    int characterPosition = 3700;
    ArrayList<Integer> position = currentPosition(numberOfCharactersInText, characterPosition);

    int expectedScrollBarPosition = 10;
    int expectedScrollBarSize = 10;
    ArrayList<Integer> expected = new ArrayList(asList(expectedScrollBarPosition, expectedScrollBarSize));

    assertEquals(expected, position);
  }
}
