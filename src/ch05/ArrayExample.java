package ch05;

public class ArrayExample {
  public static void main(String[] args) {
    int[] scores = {34,52,66,90,100,35,77};
    int sum=0;
    for (int i = 0; i < 6; i++) {
      sum += scores[i];
    }
    double avg = (double)sum/7;
    System.out.println(avg);
  }
}
