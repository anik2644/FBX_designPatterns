import Fbx.Fbx;
import Gamers.Gamer;
import Games.GamePlayer;
import Games_Components.*;

// Common abstract class for games

public class Main {
    public static void main(String[] args) {


       // GamePlayer gamePlayer= new GamePlayer();
        Gamer Anik = new Gamer("Anik");
        Fbx FBX = new Fbx();

        FBX.Authentication.login(Anik.getPlayerName());

        Anik.InstallGame( FBX.PrepareGame("actionGame"));
        Anik.InstallGame( FBX.PrepareGame("strategyGame"));//.add();
        Anik.InstallGame( FBX.PrepareGame("racingGame"));




        for (Game installedGame : Anik.InstalledGames)
        {

            new GamePlayer(installedGame,1).Play();
           // new GamePlayer(installedGame,4).Play();
            System.out.println("\n\n");
            System.out.println(installedGame.gameName() +" Scores: " + installedGame.score);
            System.out.println("\n\n\n\n");
        }


        System.out.println("\n\ncloud server test;\n");
        Anik.EditProfile();
        Anik.showProfile();


    }
}