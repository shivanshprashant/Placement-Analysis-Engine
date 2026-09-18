import java.util.Scanner;

public class SystemRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registry systemRegistry = new Registry();
        boolean isOperating = true;

        System.out.println("--- Placement Analytics System ---");

        while (isOperating) {
            System.out.println("\n[1] Register New Candidate");
            System.out.println("[2] Generate Placement Analytics");
            System.out.println("[3] Terminate System");
            System.out.print("Select action: ");
            
            int selection = InputHandler.fetchValidInt(sc);
            sc.nextLine(); 

            if (selection == 1) {
                System.out.print("Candidate Name: ");
                String name = sc.nextLine();
                
                System.out.print("Roll Number: ");
                int roll = InputHandler.fetchValidInt(sc);
                
                System.out.print("Academic Score (CGPA): ");
                double score = InputHandler.fetchValidDouble(sc);
                
                System.out.print("Coding Platform Rating: ");
                int rating = InputHandler.fetchValidInt(sc);
                
                Candidate newCandidate = new Candidate(name, roll, score, rating);
                systemRegistry.registerCandidate(newCandidate);
                
            } else if (selection == 2) {
                systemRegistry.printAllRecords();
                
            } else if (selection == 3) {
                isOperating = false;
                System.out.println("System terminating...");
                
            } else {
                System.out.println("Unrecognized action. Please try again.");
            }
        }
        sc.close();
    }
}