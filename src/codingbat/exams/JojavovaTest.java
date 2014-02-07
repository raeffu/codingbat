package codingbat.exams;


/*
 * My daughter can speek a "secret" language. 
 * The algorithm is very simple: 
 * Just add after every consonant an "o" followed by the same consonant in lowercase.
 * Characters such as הצüי etc. are not allowed. 
 * Implement this string transformation for a given input string. 
 * 
 * jojavova("Hello") = "Hohelollolo"
 * jojavova("Marcus") = "Momarorcocusos"
 * jojavova("I love Java") = "I lolovove Jojavova"
 *
 */

public class JojavovaTest {

  public static void main(String[] args){
    JojavovaTest test = new JojavovaTest();
    
    System.out.println(">"+test.jojavova("Hello")+"<");
    System.out.println(">"+test.jojavova("Marcus")+"<");
    System.out.println(">"+test.jojavova("I love Java")+"<");
  }
  
  public String jojavova(String in)  {
    String[] arr = new String[in.length() * 3];
    int size = 0;
    
    for(int i=0; i < in.length(); i++){
      if(!in.substring(i, i+1).matches("[a-zA-Z]")) {
        arr[size] = in.substring(i, i+1);
          size++;
      }
      else if(in.substring(i, i+1).equalsIgnoreCase("a") ||
        in.substring(i, i+1).equalsIgnoreCase("e") ||
        in.substring(i, i+1).equalsIgnoreCase("i") ||
        in.substring(i, i+1).equalsIgnoreCase("o") ||
        in.substring(i, i+1).equalsIgnoreCase("u") ){
          
          arr[size] = in.substring(i, i+1);
          size++;
      }
      else {
        arr[size] = in.substring(i, i+1);
          size++;
          arr[size] = "o";
          size++;
          arr[size] = in.substring(i, i+1).toLowerCase();
          size++;
      }
    }
    
    String result = "";
    
    for(int n=0; n < size; n++) {
      result += arr[n];
    }
    
    return result;
  }

}
