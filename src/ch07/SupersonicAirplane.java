package ch07;

public class SupersonicAirplane extends Airplane{
  public static final int NORMAL=1;
  public static final int SUPERSONIC=2; //변경이 불가능한 필드 속성 2개
  public int flyMode=NORMAL; //변경이 가능한 필드 속성

  @Override
  public void fly() {
    if(flyMode==SUPERSONIC){
      System.out.println("초음속 비행합니다.");
    }else {
      super.fly();
    }
  }
}
