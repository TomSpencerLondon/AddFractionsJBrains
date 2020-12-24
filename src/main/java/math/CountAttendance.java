package math;

public class CountAttendance {
  public static int childrenAttended(int collected){
    double feeForChildren = 1.5;
    double feeForAdults = 4.0;
    int totalNumberOfPeople = 2200;
    double difference = feeForAdults - feeForChildren;
    int answer = (int) (((totalNumberOfPeople * feeForAdults) - (collected)) / difference);
    return answer;
  }
}
