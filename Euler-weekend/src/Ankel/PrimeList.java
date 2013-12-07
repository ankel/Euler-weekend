package Ankel;

import java.util.ArrayList;

/**
 * Use dynamic programming to test for primality.
 */
public class PrimeList {
  private ArrayList<Long> primeList;
  final long[] somePrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
  // some primes, from http://oeis.org/A000040

  public PrimeList() {    
    primeList = new ArrayList<>();
    for (long l : somePrimes) {
      primeList.add(l);
    }
  }

  /**
   * Test if a number is prime
   * @param i the number to test
   * @return true if i is prime, otherwise false.
   */
  public boolean isPrime(long i) {
    if (primeList.contains(i)) {
      return true;
    }
    if (primeList.get(primeList.size() - 1) > i) {
      return false;
    }
    long bound = (long) Math.ceil(Math.sqrt(i));
    for (long l = 2; l <= bound; ++l) {
      if (isPrime(l) && (i % l == 0)) {
        return false;
      }
    }
    primeList.add(i);
    return true;
  }

}
