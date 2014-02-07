package codingbat.exams;


/*
 * Given an array of strings, return the count of the number of strings with 
 * the given length. 
 * 
 * charCount({"a", "bb", "b", "ccc"}, 1) = 2
 * charCount({"a", "bb", "b", "ccc"}, 3) = 1
 * charCount({"a", "bb", "b", "ccc"}, 4) = 0
 *
 */

public class CharCountTest {

  public static void main(String[] args){
    CharCountTest test = new CharCountTest();
    
    System.out.println(">"+test.charCount(new String[]{"a", "bb", "b", "ccc"}, 1)+"<");
    System.out.println(">"+test.charCount(new String[]{"a", "bb", "b", "ccc"}, 3)+"<");
    System.out.println(">"+test.charCount(new String[]{"a", "bb", "b", "ccc"}, 4)+"<");
  }
  
  public int charCount(String[] words, int len) {
    int counter = 0;
    
    for(int i=0; i < words.length; i++){
      if(words[i].length() == len){
        counter++;
      }
    }
    
    return counter;
  }

}
