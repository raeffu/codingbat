package codingbat.exams;


/*
 * Given 4 int values, a b c d return their sum. 
 * However, if one of the values is the same as another of the values, 
 * it does not count towards the sum. 
 * 
 * loneSum4(1, 2, 3, 4) = 10
 * loneSum4(1, 2, 2, 2) = 1
 * loneSum4(1, 1, 1, 1) = 0
 *
 */

public class LoneSum4Test {

  public static void main(String[] args){
    LoneSum4Test test = new LoneSum4Test();
    
    System.out.println(">"+test.loneSum4(1, 2, 3, 4)+"<");
    System.out.println(">"+test.loneSum4(1, 2, 2, 2)+"<");
    System.out.println(">"+test.loneSum4(1, 1, 1, 1)+"<");
  }
  
  public int loneSum4(int a, int b, int c, int d) {
    int sum = 0;
    
    if(a!=b && a!=c && a!=d) sum += a;
    if(b!=a && b!=c && b!=d) sum += b;
    if(c!=a && c!=b && c!=d) sum += c;
    if(d!=a && d!=b && d!=c) sum += d;  
      
    return sum;
  }

}
