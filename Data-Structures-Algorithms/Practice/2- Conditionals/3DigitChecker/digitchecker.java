import java.util.Scanner;

public class digitchecker {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int num;
   System.out.println("Enter the number to be checked: ");
   num=sc.nextInt();
   if(num >= 100 && num <= 999)
      System.out.println("Is 3 digit number");
   else
      System.out.println("Not 3 digit");
  }
}
