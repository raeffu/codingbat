package codingbat.warmup2;

/*
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern --
 * a value, followed by the value plus 5, followed by the value minus 1. 
 * Additionally the 271 counts even if the "1" differs by 2 or less from 
 * the correct value. 
 * 
 * has271({1, 2, 7, 1}) = true
 * has271({1, 2, 8, 1}) = false
 * has271({2, 7, 1}) = true
 * has271({4, 5, 3, 8, 0}) = true
 * has271({2, 7, -1}) = true
 */

public class Has271Test {

  public static void main(String[] args) {

    Has271Test test = new Has271Test();

    System.out.println(">" + test.has271(new int[] {1, 2, 7, 1}) + "<");
    System.out.println(">" + test.has271(new int[] {1, 2, 8, 1}) + "<");
    System.out.println(">" + test.has271(new int[] {2, 7, 1}) + "<");
    System.out.println(">" + test.has271(new int[] {4, 5, 3, 8, 0}) + "<");
    System.out.println(">" + test.has271(new int[] {2, 7, -1}) + "<");
  }

  public boolean has271(int[] nums) {
    boolean result = false;

    if(nums.length < 3){ return result;}
    
    for(int i = 0; i<nums.length-2;i++){
      boolean diff5 = nums[i+1] - nums[i] == 5;
      boolean diff1 = nums[i] - nums[i+2] >= -1 && nums[i] - nums[i+2] <= 3;
    
      if(diff5 && diff1){
        result = true;
      }
    }
    
    return result;
  }

}
