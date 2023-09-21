package ch05;

public class ArrayCreateByValueListExample2 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[]{83,90,87};
    int sum1 = 0;
    for (int i = 0; i < 3; i++) {
      sum1 += scores[i];

    }
    System.out.println("총합: " + sum1);

    printItem(new int[]{83, 90, 87});

    int[] a= new int[]{5,6,7};
    System.out.println(a[0]);
    System.out.println(a.length);
    a=new int[]{1,2,3,4};
    System.out.println(a[3]);
    System.out.println(a.length); //문자열의 길이를 알고 싶을 때는 length() 중괄호 필수
  }

  public static void printItem(int[] scores) {
    for (int i = 0; i < 3; i++) {
      System.out.println("score[" +i + "]: "+ scores[i]);

    }

  }
}

