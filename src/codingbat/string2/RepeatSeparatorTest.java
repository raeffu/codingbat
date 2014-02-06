package codingbat.string2;

/*
 * Given two strings, word and a separator, return a big string made of count 
 * occurences of the word, separated by the separator string. 
 * 
 * repeatSeparator("Word", "X", 3) = "WordXWordXWord"
 * repeatSeparator("This", "And", 2) = "ThisAndThis"
 * repeatSeparator("This", "And", 1) = "This"
 * 
 */

public class RepeatSeparatorTest {

  public static void main(String[] args) {

    RepeatSeparatorTest test = new RepeatSeparatorTest();

    System.out.println(">" + test.repeatSeparator("Word", "X", 3) + "<");
    System.out.println(">" + test.repeatSeparator("This", "And", 2) + "<");
    System.out.println(">" + test.repeatSeparator("This", "And", 1) + "<");  
  }

  public String repeatSeparator(String word, String sep, int count) {
    String result = "";
    
    for(int i=0; i<count; i++){
      if(i==0)
        result += word;
      else
        result += sep + word;
    }
    return result;
  }

}
