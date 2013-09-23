package codingbat;

public class Testing {

  public static void main(String[] args) {

    Testing test = new Testing();

    System.out.println(">" + test.commonEnd(new int[] { 6, 3, 45 }, new int[] { 6, 3, 45 }) + "<");
    System.out.println(">" + test.commonEnd(new int[] { 3, 45 }, new int[] { 6, 3, 45 }) + "<");
    System.out.println(">" + test.commonEnd(new int[] { 3, 5 }, new int[] {14,2256,55 }) + "<");
    System.out.println(">" + test.commonEnd(new int[] { 6, 3, 45 }, new int[] { 6, 3 }) + "<");
    System.out.println(">" + test.commonEnd(new int[] { 6 }, new int[] { 6}) + "<");
    System.out.println(">" + test.commonEnd(new int[] { 6 }, new int[] { 7}) + "<");
  }

  public boolean commonEnd(int[] a, int[] b) {  
    return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    
    
  }

}
