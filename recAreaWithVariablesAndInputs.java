import java.util.Scanner;
public class recAreaWithVariablesAndInputs {
    public static void main(String[] args) {


         Scanner scanner = new Scanner(System.in);
              
               System.out.println("Enter the length : ") ; 
               double length = scanner.nextDouble();
               scanner.nextLine();  

               System.out.println("Enter the width : ") ;
               double width = scanner.nextDouble();
                scanner.nextLine();

                double area = length * width;
                
                System.out.println("The area of the rectangle is " + area + "cm²");
             
         scanner.close();

    }
}
