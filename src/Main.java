public class Main {
    public static void main(String[] args) {
        Candidate johnDoe = new Candidate(10, "John", "Doe", "Republican");
        Utility.printCandidateInfo(johnDoe);
        Voter janeDoe = new Voter(11, "Jane", "Doe",  true);
        Utility.printVoterInfo(janeDoe);
    }
}
