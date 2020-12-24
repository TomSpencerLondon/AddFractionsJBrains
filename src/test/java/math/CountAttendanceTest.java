package math;

import org.junit.jupiter.api.Test;

import static math.CountAttendance.childrenAttended;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Richa and Yashvi are going to Jamaica with their school.
// They plan on attending a fair where the admission for
// children is $1.50 and $4.00 for adults.
// On a specific day, 2,200 people enter the fair
// and $5,050 is collected.
// How many children attended?
public class CountAttendanceTest {

  @Test
  void name() {
    int numberOfChildren = childrenAttended(5050);
    assertEquals(1500, numberOfChildren);
  }
}
