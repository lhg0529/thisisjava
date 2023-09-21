package ch05;

public class ArrayCopyExample {
  public static void main(String[] args) {
    String[] olda = {"java","array","copy"};
    String[] newa = new String[5];

    System.arraycopy(olda,0,newa,0,olda.length);

    for (int i = 0; i < newa.length; i++) {
      System.out.println(newa[i]);
    }
  }
}
