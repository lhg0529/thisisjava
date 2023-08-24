package ch4;

public class MathRandom {
  public static void main(String[] args) {
    int score = (int)(Math.random()*6+1);

    while (score <= 6){
      System.out.println(score);

    }
  }
}
