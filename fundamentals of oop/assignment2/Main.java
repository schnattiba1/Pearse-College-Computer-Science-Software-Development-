import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        // Calling the method
        signIn();
        Scores();

        
    }

    // closeProgram method
    public static void closeProgram() {
        System.out.println("The program is closing");
    }

    // signIn method
    public static void signIn() {
        // Retrieving the students's first and second name
        
        // First name
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name: ".trim());
        String firstName = input.next();

        // Second name 
        System.out.println(System.lineSeparator() + "Please enter your second name: ".trim());
        String secondName = input.next();

        // Welcoming the student and introduction
        System.out.println(System.lineSeparator() + "Hello, " + firstName + " " +secondName + ".");
        System.out.println(System.lineSeparator() + "Welcome to the calculation score program.");
        System.out.println(System.lineSeparator() + "In this calculation score program, we calculate the score of each distinction, merit or poor exam scores all togehter.");
    }

    // Scores method
    public static void Scores() {
        Scanner input = new Scanner(System.in);

        // Asking the students for their score in every module
        System.out.println(System.lineSeparator() + "Please enter score for Maths for IT");
        int score1 = input.nextInt();

        System.out.println(System.lineSeparator() + "Please enter score for Database Methods");
        int score2 = input.nextInt();

        System.out.println(System.lineSeparator() + "Please enter score for Programming Design Principles");
        int score3 = input.nextInt();

        System.out.println(System.lineSeparator() + "Please enter score for Fundamentals of OOP");
        int score4 = input.nextInt();

        System.out.println(System.lineSeparator() + "Please enter score for Software Architecture");
        int score5 = input.nextInt();


        // The calculation of scores

        // Arrays (lists) of scores
        int[] scores = { score1, score2, score3, score4, score5};

        Range<Integer> myRange = Range.between(100, 500);

        // iterating the array
        // try writing the 'try..catch' keyword
        while (true) {
        for (int score : scores) {
            if (score >= 0 && score <= 100) {
                int results = (score1 + score2 + score3 + score4 + score5) / 5;
                System.out.println(System.lineSeparator() + "The results: " + results); 
            } else {
                // Breaking out of the loop
                break;
            }
        }
    }
    }
}
