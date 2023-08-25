package ch04;

//4x+5y=60의 해를 구해 (x,y)로 출력하기. x,y는 10 이하의 자연수
public class Check5 {
  public static void main(String[] args) {
    for (int x = 1; x <=10 ; x++) {
      for (int y = 1; y <=10 ; y++) {
        if(60 == (4*x+5*y)){
          System.out.println("(" + x + ", " + y + ")");
        }
      }
    }
  }

}
