package Ankel;

/**
 *
 * @author Binh Tran
 * Problem 3:
 * The prime factors of 13195 are 5, 7, 13 and 29. 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */
public class P3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    PrimeList p = new PrimeList();
    long number = 6 * (long)Math.pow(10, 11) + 851475143;  // Integer too large, java?
    long bound = (long)Math.ceil(Math.sqrt(number));
    
    for (long i = 2; i <= bound; ++i) {
      if (number % i == 0 && p.isPrime(i)) {
        System.out.println(i);
      }
    }
  }
  
}
