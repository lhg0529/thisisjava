package ch4;

public class Check4 {
  public static void main(String[] args) {
    while (true) {
      int d1 = (int) (Math.random() * 6) + 1;
      int d2 = (int) (Math.random() * 6) + 1;

      System.out.println("(" + d1 + ", " + d2 + ")");
      if(d1+d2 == 5){
        break;
      }

    }
  }
}
