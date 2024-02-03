public class Utility {
    public static void printCandidateInfo(Candidate candidate) {
        System.out.println("Candidate ID: " + candidate.candidateID);
        System.out.println("Full Name: " + candidate.getName());
        System.out.println("Party: " + candidate.party);
    }

    public static void printVoterInfo(Voter voter) {
        System.out.println("Voter ID: " + voter.voterID);
        System.out.println("Full Name: " + voter.getName());
        System.out.println("Has Voted: " + voter.hasVoted);
    }
}
