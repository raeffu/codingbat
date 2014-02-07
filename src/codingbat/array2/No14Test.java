package codingbat.array2;

/*
 * Given an array of ints, return true if it contains no 1's or 
 * it contains no 4's. 
 * 
 * no14({1, 2, 3}) = true
 * no14({1, 2, 3, 4}) = false
 * no14({2, 3, 4}) = true
 */

public class No14Test {

  public static void main(String[] args) {

    No14Test test = new No14Test();

    System.out.println(">" + test.no14(new int[] {1, 2, 3}) + "<");
    System.out.println(">" + test.no14(new int[] {1, 2, 3, 4}) + "<");
    System.out.println(">" + test.no14(new int[] {2, 3, 4}) + "<");
  }

  public boolean no14(int[] nums) {
    boolean has1 = false;
    boolean has4 = false;

    for (int n : nums) {
      if (n == 1)
        has1 = true;
      else if (n == 4)
        has4 = true;
    }

    return !has1 || !has4;
  }
}
