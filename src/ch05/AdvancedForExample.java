package ch05;

public class AdvancedForExample {
  public static void main() {
    int[] scores = {95,71,64,82,44};
    int sum = 0;

    for(int score : scores){
      sum += score;
    }
    System.out.println(sum);
    double avg = (double) sum/ scores.length;
    System.out.println(avg);
  }
}
