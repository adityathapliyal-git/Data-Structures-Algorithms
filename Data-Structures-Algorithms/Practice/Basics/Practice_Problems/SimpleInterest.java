import java.util.Scanner;
public class SimpleInterest {
  public static void main(String[] args) {
    double si;
    double p,r,t;
    double ta;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter Principle Amount : ");
    p=in.nextDouble();
    System.out.println("Enter Rate Of Interest : ");
    r=in.nextDouble();
    System.out.println("Enter Time Duration : ");
    t=in.nextDouble();
    si=p*r*t/100;
    ta=p+si;
    System.out.println("Simple Interest : "+si);
    System.out.println("Total Amount : "+ta);
  }
}
/* Output : 
 * Enter Principle Amount : 
   2000
   Enter Rate Of Interest : 
   3
   Enter Time Duration : 
   4
   Simple Interest : 240.0
   Total Amount : 2240.0
 */
