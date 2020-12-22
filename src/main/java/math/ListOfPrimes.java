package math;

// steps:
// 1. Make an array of all numbers from 2 to M
// 2. find biggest number that must be checked
// 3. check number in the the list from 2 to sqrt M and divide each number by it


public class ListOfPrimes {
  private final int m;

  public ListOfPrimes(int m) {
    this.m = m;
  }

  public int[] list() {
    int[] primes = new int[m];
    primes[0] = 2;
    int count = 1;
    int number = 3;
    boolean numberIsPrime;

    while (count < m){
      numberIsPrime = true;
      for (int i = 1; i < (int)(Math.sqrt(number)); i++) {
        if (number % primes[i] == 0){
          numberIsPrime = false;
          break;
        }
      }
      if (numberIsPrime){
        primes[count] = number;
        count++;
      }
      number = number + 2;
    }
    return primes;
  }
}
