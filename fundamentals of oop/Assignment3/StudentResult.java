import java.util.Scanner;

// Inherits the superclass (parent class)
public class StudentResult extends Student {
    // Inherits the subclass (child class)
    @Override
    void introduction() {
        Scanner input = new Scanner(System.in);

        // First name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        // Second name
        System.out.print(System.lineSeparator() + "Enter your second name: ");
        String secondName = input.nextLine();

        // Greeting the student
        // printf -> print format
        // Print Format: %s -> string
        // Print Format: %n -> new line
        System.out.printf(System.lineSeparator() + "Hello, %s %s", firstName, secondName);
        System.out.println(System.lineSeparator() + "Welcome to the calculation score program.");
        System.out.println(System.lineSeparator() + "In this calculation score program, we calculate the score of each distinction, merit or poor exam scores all together.");
    }

    @Override 
    void studentResults() {
        Scanner input = new Scanner(System.in);

        // while this condition is true
        while (true) {
            // Asking the students for their score in every module
            // Score1
            System.out.print(System.lineSeparator() + "Please enter your score for Maths for IT: ");
            int score1 = input.nextInt();

            // Condition statement
            // Checks if the score is not a range
            if(!(score1 >= 0 && score1 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropiate range!");
                closeProgram();
                break;
            }

            // Score2
            System.out.print(System.lineSeparator() + "Please enter your score for Database Methods: ");
            int score2 = input.nextInt();

            if(!(score2 >= 0 && score2 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropiate range!");
                closeProgram();
                break;
            }

            // Score3
            System.out.print(System.lineSeparator() + "Please enter your score for Programming Design Principles: ");
            int score3 = input.nextInt();

            if (!(score3 >= 0 && score3 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropiate range!");
                closeProgram();
                break;
            }

            // Score4
            System.out.print(System.lineSeparator() + "Please enter your score for Fundamentals of OOP: ");
            int score4 = input.nextInt();

            if(!(score4 >= 0 && score4 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropiate range!");
                closeProgram();
                break;
            }

            // Score5
            System.out.print(System.lineSeparator() + "Please enter your score for Software Architecture: ");
            int score5 = input.nextInt();

            if(!(score5 >= 0 && score5 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropiate range!");
                closeProgram();
                break;
            }

            // Calculating the average of the score
            // Print format: %d -> integers
            int result = ((score1 + score2 + score3 + score4 + score5)) / 5;
            System.out.printf(System.lineSeparator() + "Your average score: %d%n", result);

            // Checks the students grade
            if (result >= 90) 
                System.out.println(System.lineSeparator() + "Your grade is: A");
            else if (result >= 80)
                System.out.println(System.lineSeparator() + "Your grade is: B");
            else if (result >= 70)
                System.out.println(System.lineSeparator() + "Your grade is: C");
            else if (result >= 60) 
                System.out.println(System.lineSeparator() + "Your grade is: C");
            else if (result <= 60) 
                System.out.println(System.lineSeparator() + "Your grade is: F");


            // Asks the student if they want to type their score again.
            Scanner scanner = new Scanner(System.in);
            System.out.println(System.lineSeparator() + "Would you like to enter your scores again? Yes(Y)/No(N)");
            String score = scanner.nextLine();

            // Checks if the student enters 'Yes/Y/y' or 'No/N/n'
            if (score.matches("Yes") || score.matches("Y") || score.matches("y")) {
                continue; // Runs the program from the beginning 
            }
            if (score.matches("No") || score.matches("N") || score.matches("n")) {
                closeProgram();
                break;
            }
        }
    }
    // Method 
    public static void closeProgram() {
        System.out.println("\nThe program is closing...");
    }
}
