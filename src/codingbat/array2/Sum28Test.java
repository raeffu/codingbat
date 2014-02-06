package codingbat.array2;


/*
 * Given an array of ints, return true if the sum of all the 2's in the array 
 * is exactly 8. 
 * 
 * sum28({2, 3, 2, 2, 4, 2}) = true
 * sum28({2, 3, 2, 2, 4, 2, 2}) = false
 * sum28({1, 2, 3, 4}) = false
 */

public class Sum28Test {

  public static void main(String[] args) {

    Sum28Test test = new Sum28Test();

    System.out.println(">" + test.sum28(new int[]{2, 3, 2, 2, 4, 2}) + "<");
    System.out.println(">" + test.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}) + "<");
    System.out.println(">" + test.sum28(new int[]{1, 2, 3, 4}) + "<");
  }

  public boolean sum28(int[] nums) {
    int sum = 0;
    
    for(int num : nums){
      if(num == 2) sum += num;
    }
    
    if(sum == 8) return true;
    return false;
  }
}
