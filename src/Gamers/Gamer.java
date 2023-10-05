package Gamers;

import CloudSystem.CloudDataManager;
import Games_Components.Game;

import java.util.ArrayList;
import java.util.List;

// Gamers.GamerProfile class
public class Gamer {
    CloudDataManager cloudDataManager = new CloudDataManager();
    private String playerName;
    public ArrayList<Game> InstalledGames;

    public Gamer(String playerName) {
        this.playerName = playerName;
        this.InstalledGames = new ArrayList<>(); // Initialize InstalledGames properly
    }
    public void playSinglePlayerGame(Game game) {
        System.out.println(playerName + " is playing a single-player game.");
        game.run(); // Run the game
      //  singlePlayerScore += game.getScore().getSinglePlayerScore(); // Update single-player score
    }

    public void playTeamGame(Game game) {
        System.out.println(playerName + " is playing a team-based game.");
        game.run(); // Run the game
        //teamScore += game.getScore().getTeamScore(); // Update team score
    }

    public String getPlayerName() {
        return playerName;
    }


    public void InstallGame(Game game) {
        InstalledGames.add(game);
    }

    public void EditProfile()
    {
        cloudDataManager.sendData("Data are sending to edit ");
    }
    public void showProfile()
    {
        cloudDataManager.retrieveData("Data are retriving to view profile: "+ playerName);
    }

/*    @Override
    public String toString() {
        return "Player Name: " + playerName + "\nSingle Player Games.Score: " + singlePlayerScore + "\nTeam Games.Score: " + teamScore;
    }*/
}
