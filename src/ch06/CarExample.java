package ch06;

public class CarExample {
  public static void main(String[] args) {
    Car myCar = new Car();
    System.out.println(myCar);
    myCar.setSpeed(-50);
    System.out.println("현재속도: "+myCar.getSpeed());

    myCar.setSpeed(60);
    System.out.println("현재속도: "+myCar.getSpeed());

    System.out.println(myCar.isStop());

    if(!myCar.isStop()){
      myCar.setStop(true);
    }
    System.out.println("현재속도: "+myCar.getSpeed());





//    Car car1 = new Car("1","2",3);
//    System.out.println(car1.company);
//    System.out.println(car1.model);

    //    System.out.println("제작회사: "+myCar.company);
//    System.out.println("모델명: "+myCar.model);
//    System.out.println("색깔: "+myCar.color);
//    System.out.println("최고속도: "+ myCar.maxspeed);
//    System.out.println("시동여부: "+myCar.start);
//    System.out.println("현재속도: "+ myCar.speed);
//
//    myCar.speed = 110;
//    System.out.println("현재속도: "+ myCar.speed);
  }
}
