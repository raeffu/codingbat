package codingbat.warmup1;

/* Given a string, take the first 2 chars and return the string 
 * with the 2 chars added at both the front and back, 
 * so "kitten" yields"kikittenki". 
 * If the string length is less than 2, use whatever chars are there. 
 * 
 * front22("kitten") = "kikittenki"
 * front22("Ha") = "HaHaHa"
 * front22("abc") = "ababcab"
*/

public class Front22Test {

  public static void main(String[] args) {

    Front22Test test = new Front22Test();

    System.out.println(">" + test.front22("kitten") + "<");
    System.out.println(">" + test.front22("Ha") + "<");
    System.out.println(">" + test.front22("abc") + "<");
  }

  public String front22(String str) {
    String first;
    
    if(str.length()<2){
      first = str.substring(0,str.length());
    }
    else{
      first = str.substring(0,2);
    }
    return first + str + first;
  }

}
