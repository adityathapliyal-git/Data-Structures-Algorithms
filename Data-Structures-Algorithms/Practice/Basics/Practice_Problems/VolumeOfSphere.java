import java.util.Scanner;
public class VolumeOfSphere {
  public static void main(String[] args) {
  int r,rcube;
  double volume;
  double pie=3.141;
  double x=1.333;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the radius : ");
  r=sc.nextInt();
  rcube=r*r*r;
  volume=x*pie*rcube;
  System.out.println("Volume of the Cicle : "+volume);
}
}
/* Output : 
 * Enter the radius : 
   4
   Volume of the Cicle : 267.964992
 */