package ch04;

import java.util.Scanner;

public class SwitchCharExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("당신의 등급은 무업입니까? : ");
    String grade = sc.nextLine();


    switch (grade.toUpperCase()){
      case "A" ->
        System.out.println("우수회원");

      case "B" ->
        System.out.println("일반회원");

//      default->
//        System.out.println("손님");
    }
  }
}
