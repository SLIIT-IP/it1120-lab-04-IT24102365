import java.util.Scanner;

public class IT24102365Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;
        String message;

        System.out.print("Enter a number: ");
        number = scanner.nextDouble();

        message=(number == 0)?"The number is: Zero":
                (number > 0)?"The number is: Positive":
                "The number is: Negative";

                System.out.print(message);

        scanner.close();
    }
}