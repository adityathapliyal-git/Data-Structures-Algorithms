import java.util.Scanner;

public class DigitPrintingReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        int sum = original + reverse;
        System.out.println("Reverse of the number: " + reverse);
        System.out.println("Sum of the number and its reverse: " + sum);
    }
}
