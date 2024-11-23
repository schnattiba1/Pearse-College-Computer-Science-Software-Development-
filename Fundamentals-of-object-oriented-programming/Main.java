import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // Tell's the system that they want to take the input from the user
     Scanner input = new Scanner(System.in); // Reference type
     System.out.println("Please enter your first name: ".trim()); // Removes the whitespaces
     String firstName = input.nextLine();
     System.out.println("Please enter your last name: ".trim()); // Removes the whitespaces
     String lastName = input.nextLine();
     System.out.println("Enter your first number: ".trim()); // Removes the whitespaces
     int num1 = input.nextInt(); 
     System.out.println("Enter your second number: ".trim()); // Removes the whitespaces
     int num2 = input.nextInt();
     double result = (num1 + num2) / 2; // Adding both num1 and num2 divided by 2.
     System.out.println("Hello," + firstName + " " + lastName);
     System.out.println("Your average is: " + result);
    }
  }
  
