package ch13;

public class Tv {
  public int solution(int angle) {
      if(angle<90){
        return 1;
      }else if(angle == 90){
        return 2;
      }else if(angle < 180){
        return 3;
      }else if(angle == 180){
        return 4;
      }
    return 1;
    }
  }
