package Ankel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gordon
 */
public class PrimeListTest {
  
  public PrimeListTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of isPrime method, of class PrimeList.
   */
  @Test
  public void testIsPrime() {
    System.out.println("isPrime");
    long primeList[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 
          59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 
          139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 
          227, 229, 233, 239, 241, 251, 257, 263, 269, 271};
    // From http://oeis.org/A000040 
    PrimeList instance = new PrimeList();
    boolean expResult = true;
    for (long i : primeList){
//      System.out.println(i);
      boolean result = instance.isPrime(i);
      assertEquals(expResult, result);
    }
    
    long nonPrimeList[] = {4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28,30,32,
      33,34,35,36,38,39,40,42,44,45,46,48,49,50,51,9000,9002,156805};
    instance = new PrimeList();
    expResult = false;
    for (long i : nonPrimeList){
//      System.out.println(i);
      boolean result = instance.isPrime(i);
      assertEquals(expResult, result);
    }
  }
  
}
