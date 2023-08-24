package ch4;

public class Check3 {
  public static void main(String[] args) {
  //3의 배수의 총합 1~100사이 출력
  int i;
  int sum=0;

    for (i = 1; i <=100 ; i++) {
      if(i%3 == 0){
        sum+=i;
      }

    }
    System.out.println(sum);

  }
}
