import java.util.Scanner;

public class Java_isPrime {
    public static void main(String[] args) {
        System.out.println("Which number that you wanna check prime?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime!");
        } else {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0 ) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime!");
            else
                System.out.println(number + " is not a prime!");
        }

    }
}
