import java.util.Scanner;

public class Kattis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int req = sc.nextInt();
    int has = sc.nextInt();
    if(has >= req){
      System.out.printf("Dr. Chaz will have %d %s of chicken left over!\n", has - req, has - req == 1 ? "piece" : "pieces");
    }
    else{
      System.out.printf("Dr. Chaz needs %d more %s of chicken!\n", req - has, req - has == 1 ? "piece" : "pieces");
    }
  }
}