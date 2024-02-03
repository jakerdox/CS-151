public class Candidate {
    final int candidateID;
    String firstName;
    String lastName;
    String party;
    public Candidate(int candidateId, String firstName, String lastName, String party) {
        this.candidateID = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
    }
    public String getName() {
        return (this.firstName + " " + this.lastName).toUpperCase();
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
