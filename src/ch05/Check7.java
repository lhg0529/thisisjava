package ch05;

public class Check7 {
  public static void main(String[] args) {
    int[] array = {1,5,3,8,2};
    int max = 0;
    for (int i = 0; i < 5; i++) {
//i<5 대신에 i<array.length 사용하면 더 편리하다. 길어질수록!
      if(max<array[i]){
        max=array[i];
      }
    }
    System.out.println(max);
  }
}
