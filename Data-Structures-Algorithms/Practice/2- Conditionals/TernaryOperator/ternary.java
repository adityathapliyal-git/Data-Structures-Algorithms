import java.util.Scanner;

public class ternary {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    num=sc.nextInt();
    System.out.println((num%2==0)?"EVEN":"ODD");
  }
}
