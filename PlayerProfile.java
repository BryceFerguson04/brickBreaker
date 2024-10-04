package edu.ncat.brickbreakerbackend;


public class PlayerProfile {
    private String name;
    private int numGamesPlayed;
    private int highScore;

    public PlayerProfile() {
        this.name = null;
        this.numGamesPlayed = 0;
        this.highScore = 0;
    }

    public PlayerProfile(String name) {
        this.name = name;
        this.numGamesPlayed = 0;
        this.highScore = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumGamesPlayed() {
        return numGamesPlayed;
    }

    public void setNumGamesPlayed(int numGamesPlayed) {
        this.numGamesPlayed = numGamesPlayed;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    @Override
    public String toString() {
        return name + '\n' + numGamesPlayed + '\n' + highScore;
    }

}
