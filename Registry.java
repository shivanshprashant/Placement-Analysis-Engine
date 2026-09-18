import java.util.ArrayList;

public class Registry {
    private ArrayList<Candidate> recordsList = new ArrayList<>();

    public void registerCandidate(Candidate c) {
        recordsList.add(c);
        System.out.println("Success: Candidate added to registry.");
    }

    public void printAllRecords() {
        if (recordsList.isEmpty()) {
            System.out.println("Registry is currently empty.");
            return;
        }
        
        for (Candidate c : recordsList) {
            String bracket = EligibilityEngine.determineBracket(c);
            System.out.println("Roll: " + c.getRollNumber() + " | Name: " + c.getApplicantName() + " | Status: " + bracket);
        }
    }
}