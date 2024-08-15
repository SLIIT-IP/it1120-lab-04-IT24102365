import java.util.Scanner;

public class IT24102365Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double eMarks;
        double lMarks;
        double ePercentage;
        double lPercentage;
        double fMarks;

        System.out.print("Plase enter exam marks (out of 100): ");
        eMarks = scanner.nextDouble();

        if (0 <= eMarks && eMarks <= 100) {
            System.out.print("Plase enter lab submission marks (out of 100): ");
            lMarks = scanner.nextDouble();
            if (0 <= lMarks && lMarks <= 100) {
                System.out.print("Plase enter the percentage given for the exam: ");
                ePercentage = scanner.nextDouble();
                if (0 <= ePercentage && ePercentage <= 100) {
                    System.out.print("Plase enter the percentage given for the lab subbmission: ");
                    lPercentage = scanner.nextDouble();
                    if (lPercentage == (100 - ePercentage)) {
                        fMarks = ((eMarks * ePercentage) / 100) + ((lMarks * lPercentage) / 100);
                        System.out.print("\nFinal exam marks is: " + fMarks);
                    } else {
                        System.out.print("The percentages must add up to 100. Terminating program.");
                    }
                } else {
                    System.out.print("Invalid input for the percentage given for the exam. Terminating program.");
                }
            } else {
                System.out.print("Invalid input for lab submission marks. Terminating program.");
            }
        } else {
            System.out.print("Invalid input for exam marks. Terminating program.");
        }

        scanner.close();
    }
}
