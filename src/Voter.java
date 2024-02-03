public class Voter {
    final int voterID;
    String firstName;
    String lastName;
    boolean hasVoted;
    public Voter(int voterID, String firstName, String lastName, boolean hasVoted) {
        this.voterID = voterID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasVoted = hasVoted;
    }
    public String getName() {
        return (this.firstName + " " + this.lastName).toUpperCase();
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

