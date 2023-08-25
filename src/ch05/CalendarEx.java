package ch05;

import java.util.Calendar;

public class CalendarEx {
  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    System.out.println(year);
    int month = now.get(Calendar.MONTH)+1; //미국인 기준 1월을 숫자 1이 아니라 january로 생각해서 0부터 시작
    System.out.println(month);
  }
}
