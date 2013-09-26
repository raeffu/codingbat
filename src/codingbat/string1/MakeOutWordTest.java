package codingbat.string1;

//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j. 
//
//makeOutWord("<<>>", "Yay") = "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") = "<<WooHoo>>"
//makeOutWord("[[]]", "word") = "[[word]]"

public class MakeOutWordTest {

  public static void main(String[] args) {

    MakeOutWordTest test = new MakeOutWordTest();

    System.out.println(">" + test.makeOutWord("<<>>", "Yay") + "<");
    System.out.println(">" + test.makeOutWord("<<>>", "WooHoo") + "<");
    System.out.println(">" + test.makeOutWord("[[]]", "word") + "<");
  }

  public String makeOutWord(String out, String word) {
    String start = out.substring(0, 2);
    String end = out.substring(2, 4);
    return start + word + end;
  }

}
