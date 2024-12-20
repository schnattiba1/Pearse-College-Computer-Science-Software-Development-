package com.chanel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calling the method
        programIntroduction();
        studentScore();
    }

    // closeProgram method
    public static void closeProgram() {
        System.out.println("\nThe program is closing...");
    }

    // programIntroduction method
    public static void programIntroduction() {
        // Retrieving the students first and second name

        // Asking the student's full name
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = input.next();

        System.out.print("Please enter your second name: ");
        String secondName = input.next();

        // Welcoming the student and introduction
        System.out.println(System.lineSeparator() + "Hello, " + firstName + " " + secondName +  ".");
        System.out.println(System.lineSeparator() + "Welcome to the calculation score program.");
        System.out.println(System.lineSeparator() + "In this calculation score program, we calculate the score of each distinction, merit or poor exam scores all together.");
    }

    // studentScores method
    public static void studentScore() {
        Scanner input = new Scanner(System.in);

        // While this condition is true
        while (true) {
            // Asking the students for their score in every module
            System.out.println(System.lineSeparator() + "Please enter score for Maths for IT");
            int score1 = input.nextInt();

            // Condition statement -> checks if the score is not a range
            if (!(score1 >= 0 && score1 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropriate range!");
                closeProgram();
                break;
            }

            System.out.println(System.lineSeparator() + "Please enter score for Database Methods");
            int score2 = input.nextInt();

            if (!(score2 >= 0 && score2 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropriate range!");
                closeProgram();
                break;
            }

            System.out.println(System.lineSeparator() + "Please enter score for Programming Design Principles");
            int score3 = input.nextInt();

            if (!(score3 >= 0 && score3 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropriate range!");
                closeProgram();
                break;
            }

            System.out.println(System.lineSeparator() + "Please enter score for Fundamentals of OOP");
            int score4 = input.nextInt();

            if (!(score4 >= 0 && score4 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropriate range!");
                closeProgram();
                break;
            }

            System.out.println(System.lineSeparator() + "Please enter score for Software Architecture");
            int score5 = input.nextInt();

            if (!(score5 >= 0 && score5 <= 100)) {
                System.out.println(System.lineSeparator() + "You entered an inappropriate range!");
                closeProgram();
                break;
            }
            
            int result = ((score1 + score2 + score3 + score4 + score5)) / 5;
            System.out.println(System.lineSeparator() + "Your average score: " + result);

            System.out.println(System.lineSeparator() + "Would you like to enter your scores again? Yes(Y)/No(N) ");
            String enterScoresAgain = input.next();
            
            // Checks if the student entered a 'Yes' or a 'No'
            if (enterScoresAgain.matches("Yes") || enterScoresAgain.matches("Y")) {
                continue;
            }
            if (enterScoresAgain.matches("No") || enterScoresAgain.matches("N")) {
                closeProgram();
                break;
            }
        }
    }
}
