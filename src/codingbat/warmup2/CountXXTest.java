package codingbat.warmup2;

/*
 * Count the number of "xx" in the given string. 
 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx". 
 * 
 * countXX("abcxx") = 1
 * countXX("xxx") = 2
 * countXX("xxxx") = 3
 */

public class CountXXTest {

  public static void main(String[] args) {

    CountXXTest test = new CountXXTest();

    System.out.println(">" + test.countXX("abcxx") + "<");
    System.out.println(">" + test.countXX("xxx") + "<");
    System.out.println(">" + test.countXX("xxxx") + "<");
  }

  int countXX(String str) {
    int counter = 0;
    
    for(int i = 0; i < str.length() - 1; i++){
      if(str.substring(i, i+2).equals("xx")){
        counter += 1;
      }
    }
    
    return counter;
  }

}
