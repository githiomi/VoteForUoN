package Models;

public class Candidate {

    // Candidate attributes
    public String candidateId;
    public String candidateName;
    public String candidateGender;
    public int candidateAge;
    public int votesGarnered;
    public String positionVied;

    // Empty Constructor
    public Candidate() {
    }

    // Constructor
    public Candidate(String candidateId, String candidateName, String candidateGender, int candidateAge, int votesGarnered, String positionVied) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.candidateGender = candidateGender;
        this.candidateAge = candidateAge;
        this.votesGarnered = votesGarnered;
        this.positionVied = positionVied;
    }

    // Getters and Setters
    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateGender() {
        return candidateGender;
    }

    public void setCandidateGender(String candidateGender) {
        this.candidateGender = candidateGender;
    }

    public int getCandidateAge() {
        return candidateAge;
    }

    public void setCandidateAge(int candidateAge) {
        this.candidateAge = candidateAge;
    }

    public int getVotesGarnered() {
        return votesGarnered;
    }

    public void setVotesGarnered(int votesGarnered) {
        this.votesGarnered = votesGarnered;
    }

    public String getPositionVied() {
        return positionVied;
    }

    public void setPositionVied(String positionVied) {
        this.positionVied = positionVied;
    }

}
