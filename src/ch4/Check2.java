package ch4;

public class Check2 {
  public static void main(String[] args) {
    String grade = "B";

    int score = 0;
    switch (grade){
      case "A" -> score = 100;

      case "B" -> {
        int result = 100 - 20;
        score = result;
      }
      default -> score=60;

    }
    System.out.println(score);
  }
}
