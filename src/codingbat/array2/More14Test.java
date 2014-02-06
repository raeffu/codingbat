package codingbat.array2;


/*
 * Given an array of ints, return true if the number of 1's is greater than 
 * the number of 4's 
 * 
 * more14({1, 4, 1}) = true
 * more14({1, 4, 1, 4}) = false
 * more14({1, 1}) = true
 */

public class More14Test {

  public static void main(String[] args) {

    More14Test test = new More14Test();

    System.out.println(">" + test.more14(new int[]{1, 4, 1}) + "<");
    System.out.println(">" + test.more14(new int[]{1, 4, 1, 4}) + "<");
    System.out.println(">" + test.more14(new int[]{1, 1}) + "<");
  }

  public boolean more14(int[] nums) {
    int one = 0;
    int four = 0;
    
    for(int num : nums){
      if(num == 1) one += 1;
      if(num == 4) four += 1;
    }
    
    return one > four;
  }
}
