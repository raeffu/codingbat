package codingbat.array2;

/*
 * Given an array of ints, return true if the value 3 appears in the array 
 * exactly 3 times, and no 3's are next to each other. 
 * 
 * haveThree({3, 1, 3, 1, 3}) = true
 * haveThree({3, 1, 3, 3}) = false
 * haveThree({3, 4, 3, 3, 4}) = false
 */

public class HaveThreeTest {

  public static void main(String[] args) {

    HaveThreeTest test = new HaveThreeTest();

    System.out.println(">" + test.haveThree(new int[] {3, 1, 3, 1, 3}) + "<");
    System.out.println(">" + test.haveThree(new int[] {3, 1, 3, 3}) + "<");
    System.out.println(">" + test.haveThree(new int[] {3, 4, 3, 3, 4}) + "<");
  }

  public boolean haveThree(int[] nums) {
    int counter = 0;
    
    if(nums.length < 5){return false;}
    
    for(int i=0;i<nums.length-2; i++){
      if(nums[i] == 3){
        if(nums[i+1] != 3){
          counter++;
        }
      }
    }
    
    if(nums[nums.length-1] == 3 && nums[nums.length-2] != 3){
      counter++;
    }
    
    return counter == 3;
  }

}
