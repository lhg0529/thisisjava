package programmers;

public class FlippingString {
  public static void main(String[] args) {
    String x ="abcde";
    int b = (x.length());
    String str="";
    for (int i = 0; i < x.length(); i++) {
      str +=x.charAt(x.length()-i-1);
    }

    System.out.println(str);
  }
}
