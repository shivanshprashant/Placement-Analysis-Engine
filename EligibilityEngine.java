public class EligibilityEngine {
    
    public static String determineBracket(Candidate applicant) {
        double score = applicant.getAcademicScore();
        int rating = applicant.getCodingRating();
        
        if (score >= 9.0 && rating >= 1600) {
            return "Bracket A: High-Tier Placement";
        } else if (score >= 8.0 && rating >= 1200) {
            return "Bracket B: Mid-Tier Placement";
        } else if (score >= 6.5) {
            return "Bracket C: Standard Placement";
        }
        
        return "Not Eligible for Current Cycle";
    }
}