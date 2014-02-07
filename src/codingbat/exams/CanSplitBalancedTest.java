package codingbat.exams;

/*
 * Given a non-empty array, return true if there is a place to split the array 
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 *  on the other side. 
 *  
 *  canSplitBalanced({1, 1, 1, 2, 1}) = true
 *  canSplitBalanced({2, 1, 1, 2, 1}) = false
 *  canSplitBalanced({1}) = false
 *
 */

public class CanSplitBalancedTest {

  public static void main(String[] args) {
    CanSplitBalancedTest test = new CanSplitBalancedTest();

    System.out.println(">"+ test.canSplitBalanced(new int[] {1, 1, 1, 2, 1}) + "<");
    System.out.println(">"+ test.canSplitBalanced(new int[] {2, 1, 1, 2, 1}) + "<");
    System.out.println(">"+ test.canSplitBalanced(new int[] {1}) + "<");
  }

  public boolean canSplitBalanced(int[] nums) {
    int sumStart = 0;
    int sumEnd = 0;
    
    if(nums.length < 2) return false;
    
    for(int i=0; i < nums.length; i++){
      sumStart += nums[i];
      
      sumEnd = 0;
      for(int j=nums.length-1; j > i; j--){
        sumEnd += nums[j];
      }
      
      if(sumStart==sumEnd) return true;
    }
    
    return false;
  }

}
