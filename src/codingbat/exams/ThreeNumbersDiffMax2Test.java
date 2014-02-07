package codingbat.exams;


/*
 * Given an array of sorted numbers in increasing order, 
 * return true if the array contains 3 adjacent numbers that differ from each 
 * other by at most 2, such as with {3, 4, 5} or {3, 5, 5}. 
 * 
 * ThreeNumbersDiffMax2({3,4,5,5,7,8,9}) = true
 * ThreeNumbersDiffMax2({3,4,6}) = false
 * ThreeNumbersDiffMax2({1,3,5,5}) = true
 *
 */

public class ThreeNumbersDiffMax2Test {

  public static void main(String[] args){
    ThreeNumbersDiffMax2Test test = new ThreeNumbersDiffMax2Test();
    
    System.out.println(">"+test.ThreeNumbersDiffMax2(new int[]{3,4,5,5,7,8,9})+"<");
    System.out.println(">"+test.ThreeNumbersDiffMax2(new int[]{3,4,6})+"<");
    System.out.println(">"+test.ThreeNumbersDiffMax2(new int[]{1,3,5,5})+"<");
  }
  
  public boolean ThreeNumbersDiffMax2(int[] scores) {
    int a = 0;
    int c = 0;
    
    if(scores.length < 3){
      return false;
    }
    
    for(int i = 0; i < scores.length-2; i++){
      a = scores[i];
      c = scores[i+2];
      
      if(Math.abs(a-c) <= 2){
        return true;
      }
    }
    
    return false;
  }
}
