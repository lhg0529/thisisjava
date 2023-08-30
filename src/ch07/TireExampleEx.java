package ch07;

public class TireExampleEx {
  public static void main(String[] args) {
    TireExample tireExample = new TireExample();

    tireExample.tire = new Tire();
    tireExample.run();

    tireExample.tire = new HankookTire();
    tireExample.run();

    tireExample.tire = new KumhoTire();
    tireExample.run();
  }
}
