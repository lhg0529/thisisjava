package ch06;

public class Car {
  private int speed;
  private boolean stop;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    if(speed<0){
      this.speed = 0;
      return;
    } else{
      this.speed = speed;
    }

  }

  public boolean isStop(){
    return stop;
  }

  public void setStop(boolean stop){
    this.stop = stop;
    if (stop == true) this.speed = 0;
  }
}
//  String company = "현대자동차";
//  String model;
//  String color;
//  //boolean start;
//  //int speed;
//  int maxspeed = 350;
//
//  Car() {}
//  Car(String model){
//
//    this(model,"은색", 250);
//    //this.model = model;
//    System.out.println("123");
//  }
//  Car(String model, String color){
//    this.model = model;
//    this.color = color;
//  }
//  Car(String model, String color, int maxspeed){
//    this.model = model;
//    this.color = color;
//    this.maxspeed = maxspeed;
//  }
//}
