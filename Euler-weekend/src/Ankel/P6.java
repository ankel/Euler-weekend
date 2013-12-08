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
 * Problem 6: 
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // the difference between (a1 + a2 + ... + an)^2 - a1^2 - a2^2 - ... - an^2 is
      // 2(a1a2 + ... + a1an + a2a3 + ... + a2an +... + a_(n-1)an)
      
      int sum = 0;
      for (int i = 1; i <= 100; ++i) {
        for (int j = i+1; j <= 100; ++j) {
          sum += i * j;
        }
      }
      
      System.out.println(2 * sum);
    }

}
