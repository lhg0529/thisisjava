package ch06;

public class CalculatorExample {
  public static void main(String[] args) {
    Calculator cal = new Calculator();

    double result1 = cal.areaRectangle(3);
    double result2 = cal.areaRectangle(3,5);

    System.out.println(result1 +" "+ result2);
  }
}
