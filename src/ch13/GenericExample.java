package ch13;

public class GenericExample {
  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.content = "으아아아";
    System.out.println(box.content);
    String str = box.content;
    System.out.println(str);

    Box<Integer> box1 = new Box<>();
    int a = box1.content = 3;
    System.out.println(a);
    System.out.println(box1.content);
  }
}
