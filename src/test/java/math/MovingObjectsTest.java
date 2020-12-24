package math;
//    A ball is dropped from a height of 3 meters.
//    On its first bounce it rises to a height of 2 meters.
//    It keeps falling and bouncing to 2/3 of the height
//    it reached in the previous bounce.
//    On which bounce will it rise to a height
//    less than 0.5 meters?

import org.junit.jupiter.api.Test;

import static math.MovingObjects.count;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingObjectsTest {
  @Test
  void returns_count_of_bounces_for_ball_from_height_of_2_metres() {
    int count = count(3.0);

    assertEquals(5, count);
  }
}
