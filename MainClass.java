import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        try {
            System.out.println("Enter a numer: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            Prime p = new Prime();
            boolean result = p.isPrime(number);

            if (result) {
                System.out.println(number + " is not a prime number.");
            } else {
                System.out.println(number + " is a prime number.");
            }

        } catch(Exception e) {
            System.out.println("Only numbers are allowed");
        }

    }
}
