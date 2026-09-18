public class Candidate {
    private String applicantName;
    private int rollNumber;
    private double academicScore;
    private int codingRating;

    public Candidate(String applicantName, int rollNumber, double academicScore, int codingRating) {
        this.applicantName = applicantName;
        this.rollNumber = rollNumber;
        this.academicScore = academicScore;
        this.codingRating = codingRating;
    }

    public String getApplicantName() { return applicantName; }
    public int getRollNumber() { return rollNumber; }
    public double getAcademicScore() { return academicScore; }
    public int getCodingRating() { return codingRating; }
    
    public void setAcademicScore(double academicScore) { this.academicScore = academicScore; }
    public void setCodingRating(int codingRating) { this.codingRating = codingRating; }
}