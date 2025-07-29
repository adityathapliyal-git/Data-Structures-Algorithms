import java.util.Scanner;

public class profitloss {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cp,sp;
    System.out.println("Enter Cost Price : ");
    cp=sc.nextInt();
    System.out.println("Enter Selling Price : ");
    sp=sc.nextInt();
    if(sp>cp){
      System.out.println("Profitable");
    }
    if (cp>sp) {
      System.out.println("Loss Making");
    }
  }
}