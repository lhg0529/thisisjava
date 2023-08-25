package ch05;

public class CharAtExample {
  public static void main(String[] args) {
    String ssn = "9906182784131";
    System.out.println(ssn.charAt(6));
    int s = ssn.charAt(6);
    int length = ssn.length();
    System.out.println(length);
    switch (s){
      case '2','4' -> System.out.println("여자");
      case '1','3' -> System.out.println("남자");
    }
  }
}
