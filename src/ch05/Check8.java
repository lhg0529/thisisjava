package ch05;
//전체 합과 평균을 구해 출력하는 코드 작성하기(중첩for문)
public class Check8 {
  public static void main(String[] args) {
    int[][] array = {
        {95, 86},
        {83, 92, 96},
        {78, 83, 93, 87, 88}
    };

    int sum = 0;
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length ; j++) {        //array[i].length 쓸 생각 못했음, count도
        sum+= array[i][j];
        count++;
      }

    }
    System.out.println("합계는 "+sum);

    double avg = (double) sum / count;
    System.out.println("평균은 : "+avg);
  }
}