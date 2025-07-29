import java.util.Scanner;
public class AreaOfCircle {
  public static void main(String[] args) {
  int r;
  double area;
  double pie=3.14;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the radius : ");
  r=sc.nextInt();
  area=pie*r*r;
  System.out.println("Area of the Cicle : "+area);
  }
}
/* Output :
 * Enter the radius : 
   4
  Area of the Cicle : 50.24
 */
