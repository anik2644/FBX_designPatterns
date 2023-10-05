import Fbx.Fbx;
import Gamers.Gamer;
import Games.GamePlayer;
import Games_Components.*;

// Common abstract class for games

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Fbx FBX = Fbx.getInstance();
       // GamePlayer gamePlayer= new GamePlayer();
        Gamer Anik = new Gamer("Anik");


        FBX.Authentication.login(Anik.getPlayerName());

        Anik.InstallGame( FBX.PrepareGame("actionGame"));
        Anik.InstallGame( FBX.PrepareGame("strategyGame"));//.add();
       // Anik.InstallGame( FBX.PrepareGame("racingGame"));


        Gamer Nafisa = new Gamer("Nafisa");


        FBX.Authentication.signup(Nafisa.getPlayerName());

        Nafisa.InstallGame( FBX.PrepareGame("racingGame"));


        for (Game installedGame : Anik.InstalledGames)
        {

            new GamePlayer(installedGame,1).Play();

            System.out.println(installedGame.gameName() +" Scores: " + installedGame.score);
            System.out.println("Exit from SingleMode");
            System.out.println("\n\n");
            System.out.println("Play with MultiPlayer");
            Thread.sleep(1500);

            new GamePlayer(installedGame,4).Play();
            System.out.println("\n\n");
            System.out.println(installedGame.gameName() +" Scores: " + installedGame.score);
            System.out.println("Exit from the Game");
            System.out.println("\n\n\n\n");
        }


        System.out.println("\n\n>>>>>>Nafisa is Playing>>>>>>>>>>>\n\n");
        for (Game installedGame : Nafisa.InstalledGames)
        {

            new GamePlayer(installedGame,1).Play();

            System.out.println(installedGame.gameName() +" Scores: " + installedGame.score);
            System.out.println("Exit from SingleMode");
            System.out.println("\n\n");
        }




        System.out.println("\n\ncloud server test:\n\n");
        Anik.EditProfile();
        Anik.showProfile();
        System.out.println("\n\nTrying CheatCode:\n\n");
        Anik.tryCheatCode();


    }
}