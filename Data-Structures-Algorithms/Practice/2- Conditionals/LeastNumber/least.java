import java.util.Scanner;

public class least {
  public static void main(String[] args) {
    int num1,num2,num3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 number : ");
    num1=sc.nextInt();
    System.out.println("Enter 2 number : ");
    num2=sc.nextInt();
    System.out.println("Enter 3 number : ");
    num3=sc.nextInt();
    if(num1>num2 && num1>num3){
      System.out.println("1 number is GREATEST");
    }
    if(num2>num1 && num2>num3){
      System.out.println("2 number is GREATEST");
    }
    if(num3>num1 && num3>num2){
      System.out.println("3 number is GREATEST");
    }
  }
}
