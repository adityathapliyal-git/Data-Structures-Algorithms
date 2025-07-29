import java.util.Scanner;

public class evenodd{
  public static void main(String[] args) {
    int num;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number to be checked : ");
    num=sc.nextInt();
    if(num%2==0){
      System.out.println(num+" : is a even number");
    }
    if(num%2!=0){
      System.out.println(num+" : is a odd number");
    }
  }
}