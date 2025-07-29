import java.util.Scanner;

public class RecPVSA {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double l,b,area,para;
    System.out.println("Enter the Lenght of Rectangle : ");
    l=sc.nextDouble();
    System.out.println("Enter the Breadth of Rectangle : ");
    b=sc.nextDouble();
    area=l*b;
    para=2*(l+b);
    if(area>para){
      System.out.println("Area is Greater than the Parameter");
    }
    if (para>area) {
      System.out.println("Parameter is greater than Area");
    }
  }
}
