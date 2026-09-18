import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    
    public static int fetchValidInt(Scanner scan) {
        while (true) {
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please provide a whole number.");
                scan.next(); 
            }
        }
    }
    
    public static double fetchValidDouble(Scanner scan) {
        while (true) {
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please provide a valid decimal value.");
                scan.next(); 
            }
        }
    }
}
