package com.example.myunited;

public class Squad {
    private String playerName;

    private String jerseyNumber;

    private int playerImage;


    public Squad(String playerName, String jerseyNumber, int playerImage) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.playerImage = playerImage;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(int playerImage) {
        this.playerImage = playerImage;
    }
}
