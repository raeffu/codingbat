package codingbat.array1;

import java.util.Arrays;

/* Start with 2 int arrays, a and b, of any length. 
 * Return how many of the arrays have 1 as their first element. 
 * 
 * start1({1, 2, 3}, {1, 3}) = 2
 * start1({7, 2, 3}, {1}) = 1
 * start1({1, 2}, {}) = 1
 * 
 */

public class Start1Test {

  public static void main(String[] args) {

    Start1Test test = new Start1Test();

    System.out.println(">"
        + (test.start1(new int[] { 1, 2, 3 }, new int[] { 1, 3 })) + "<");
    System.out.println(">"
        + (test.start1(new int[] { 7, 2, 3 }, new int[] { 1 })) + "<");
    System.out.println(">"
        + (test.start1(new int[] { 1, 2 }, new int[] {}))
        + "<");
  }

  public int start1(int[] a, int[] b) {
    int counter = 0;

    if (a.length >= 1)
      counter += (a[0] == 1) ? 1 : 0;
    if (b.length >= 1)
      counter += (b[0] == 1) ? 1 : 0;

    return counter;
  }

}
