package ch07;

public class SupersonicAirplaneExample {
  public static void main(String[] args) {
    SupersonicAirplane sa = new SupersonicAirplane();
    sa.fly();
    sa.flyMode = 2; //SupersonicAirplane.SUPERSONIC;
    sa.fly();
    sa.flyMode = SupersonicAirplane.NORMAL;
    sa.fly();
    sa.land();
  }
}
