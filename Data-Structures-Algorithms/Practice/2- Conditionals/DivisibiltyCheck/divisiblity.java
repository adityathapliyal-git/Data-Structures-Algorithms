import java.util.Scanner;

public class divisiblity {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number to Check");
    num =sc.nextInt();
    if(num%5==0){
      System.out.println("Divisible by 5");
    }
    if (num%5!=0) {
      System.out.println("Not Divisible by 5");
    }
  }
}
