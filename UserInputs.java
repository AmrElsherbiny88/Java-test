
import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {

        // ************************* user input *************************
        //  create a scanner object
        Scanner scanner = new Scanner(System.in);

        //  message to the user
        System.out.println("Enter your name: ");

        //    get the user input
        String name = scanner.nextLine();

        //   print the user input
        System.out.println("Hello, " + name + "!");

        // **************************
        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old.");

        // **************************
        System.out.println("Enter your GPA: ");

        double gpa = scanner.nextDouble();

        System.out.println("Your GPA is " + gpa);

        // **************************
        System.out.println("Are you a student? (true/false)");

        boolean isStudent = scanner.nextBoolean();

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        //   close the scanner
        scanner.close();

        // ************************* user input *************************
        // another example 
        // Scanner type = new Scanner(System.in);
        // System.out.println("Enter your gender: ");
        // String gender = type.nextLine();
        // System.out.println("your gender is" + gender);
        // type.close();
    }
}
