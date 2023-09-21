package ch05;

public class IndexOfContainsExample {
  public static void main(String[] args) {
    String subject = "자바 프로그래밍";
    int location = subject.indexOf("프로그래밍");

    System.out.println(location);

    String substring = subject.substring(1,5);
    System.out.println(substring);
  }
}
