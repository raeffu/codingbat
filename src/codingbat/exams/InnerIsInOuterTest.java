package codingbat.exams;

/*
 * Given two arrays of ints sorted in increasing order, outer and inner, 
 * return true if all of the numbers in inner appear in outer. 
 * The best solution makes only a single "linear" pass of both arrays, 
 * taking advantage of the fact that both arrays are already in sorted order. 
 * 
 * innerIsInOuter({1,2,4,5}, {2,4}) = true
 * innerIsInOuter({1,2,4,5}, {1,2,4,5}) = true
 * innerIsInOuter({1,2,4,5,6}, {2,6}) = true
 *
 */

public class InnerIsInOuterTest {

  public static void main(String[] args) {
    InnerIsInOuterTest test = new InnerIsInOuterTest();

    System.out.println(">"+ test.innerIsInOuter(new int[] {1, 2, 4, 5}, 
                                                new int[] {2, 4}) + "<");
    System.out.println(">"+ test.innerIsInOuter(new int[] {1, 2, 4, 5}, 
                                                new int[] {1,2,4,5}) + "<");
    System.out.println(">"+ test.innerIsInOuter(new int[] {1,2,4,5,6}, 
                                                new int[] {2,6}) + "<");
  }

  public boolean innerIsInOuter(int[] outer, int[] inner) {

    for (int i = 0; i < inner.length; i++) {
      boolean match = false;
      int check = inner[i];

      for (int j = 0; j < outer.length; j++) {
        if (outer[j] == check)
          match = true;
      }
      if (!match)
        return false;
    }
    return true;
  }
}
