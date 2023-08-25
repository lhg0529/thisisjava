package ch04;

public class Check6 {
  public static void main(String[] args) {
    String str = "*"; //이걸 for 안쪽에 둬서 계속 초기화 됐었음 멍충
    for (int i = 0; i < 5; i++) {
      System.out.println(str);
      str = str + "*";


    }
  }
}
