package ch06;

public class Car {
  String company = "현대자동차";
  String model;
  String color;
  //boolean start;
  //int speed;
  int maxspeed = 350;

  Car() {}
  Car(String model){

    this(model,"은색", 250);
    //this.model = model;
    System.out.println("123");
  }
  Car(String model, String color){
    this.model = model;
    this.color = color;
  }
  Car(String model, String color, int maxspeed){
    this.model = model;
    this.color = color;
    this.maxspeed = maxspeed;
  }
}
