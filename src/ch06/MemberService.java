package ch06;

public class MemberService {
  public boolean login(String id, String password) {
    if (id.equals("hong") && password.equals("12345")) {
      return true;

    } else{
      return false;
    }
  }

  public void logout(String id){
    System.out.println(id+"님이 로그아웃 되셨습니다");
  }
}
//  String id;
//  String password;
//  public MemberService(String id, String password){
//    this.id = id;
//    this.password = password;
//  }

