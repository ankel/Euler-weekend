package Ankel;

/**
 *
 * @author Binh Tran
 *
 * Problem 1: If we list all the natural numbers below 10 that are multiples of
 * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum
 * of all the multiples of 3 or 5 below 1000.
 */
public class P1 {
   
  public static final int UPPER_BOUND = 1000;

  public static void main(String[] args) {
    long sum = 0;
    
    int temp = UPPER_BOUND / 3;
    for (int i = 1; i <= temp; ++i) {
      sum += i * 3;
    }
    
    temp = UPPER_BOUND / 5;
    for (int i = 1; i < temp; ++i) {
      if (i % 3 != 0) {
        sum += i * 5;
      }
    }
    
    System.out.println(sum);
  }

}
