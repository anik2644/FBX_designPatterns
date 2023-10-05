package Games_Components;

// Concrete classes for action, racing, and strategy-based games
class Score {
    private int singlePlayerScore;
    private int teamScore;

    public Score() {
        this.singlePlayerScore = 0;
        this.teamScore = 0;
    }

    public void increaseSinglePlayerScore(int points) {
        singlePlayerScore += points;
    }

    public void increaseTeamScore(int points) {
        teamScore += points;
    }

    public int getSinglePlayerScore() {
        return singlePlayerScore;
    }

    public int getTeamScore() {
        return teamScore;
    }

    @Override
    public String toString() {
        return "Single Player Score: " + singlePlayerScore + ", Team Score: " + teamScore;
    }
}
