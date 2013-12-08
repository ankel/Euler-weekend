/*
 * The MIT License
 *
 * Copyright 2013 Binh Tran.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Ankel;

/**
 *
 * @author Binh Tran
 *
 * Problem 4: A palindromic number reads the same both ways. The largest
 * palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */
public class P4 {
  /**
   * Check if a number is palindromic. Could be faster but meh, 
   * 3-digit * 3-digit is less than 7 digit.
   * @param i the number to check
   * @return true if palindromic, otherwise false.
   */
  public static boolean isPalin(Integer i) {
    String s1 = i.toString(), s2 = (new StringBuilder(s1)).reverse().toString();
    return s1.equals(s2);
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int max = 0;
    
    for (int i = 999; i >= 100; --i) {
      for (int j = 999; j >= 100; --j) {
        if (isPalin(i * j) && (i * j > max)) {
          max = i * j;
        }
      }
    }
    System.out.println(max);
  }

}
