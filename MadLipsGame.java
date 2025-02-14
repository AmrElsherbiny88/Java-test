import java.util.Scanner ; 
public class MadLipsGame {
    public static void main( String[] args ){
           
        Scanner scanner = new Scanner (System.in);

        String noun ; 
        String adjective ;
        String verb ;
        String verb2 ;
          

        System.out.println("Let's play Mad Lips!");

        System.out.print("Enter a noun (animal / person) :  ");
        noun = scanner.nextLine();
        System.out.print("Enter a adjective (description) :  ");
        adjective = scanner.nextLine();

        System.out.print("Enter a verb ends with -ing :  ");
        verb = scanner.nextLine();

        System.out.print("Enter another verb ends with -ing :  ");
        verb2 = scanner.nextLine();


        System.out.println(noun + " " + "is" + " " + adjective + " " + "and" + " " + verb +  " " + "and" + " " + verb2 + "!");

        scanner.nextLine();
        scanner.close();
    }
}
