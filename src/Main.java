import Fbx.Fbx;
import Gamers.Gamer;
import Games_Components.*;

// Common abstract class for games

public class Main {
    public static void main(String[] args) {

        Gamer Anik = new Gamer("Anik");
        Fbx FBX = new Fbx();

        FBX.Authentication.login(Anik.getPlayerName());

        Anik.InstallGame( FBX.PrepareGame("actionGame",1));
        Anik.InstallGame( FBX.PrepareGame("actionGame",2));//.add();
        Anik.InstallGame( FBX.PrepareGame("racingGame",1));




        for (Game installedGame : Anik.InstalledGames)
        {
            installedGame.run();
            System.out.println("\n\n");
            System.out.println("Action Games.Game Scores: " + installedGame.score);
            System.out.println("\n\n\n\n");
        }





/*        InputHandler inputHandler = new InputHandler() {
            @Override
            public void handleInput() {
                System.out.println("Handling input for the game...");
            }
        };

        UIElement uiElement = new UIElement() {
            @Override
            public void display() {
                System.out.println("Displaying game UI...");
            }
        };

        AudioManager audioManager = new AudioManager() {
            @Override
            public void playSound(String sound) {
                System.out.println("Playing sound: " + sound);
            }

            @Override
            public void playMusic(String music) {
                System.out.println("Playing music: " + music);
            }
        };

        boolean isMultiplayer = false; // Set to true for multiplayer games

        // Create and run an action game
        Game actionGame = new ActionGame(inputHandler, uiElement, audioManager, isMultiplayer);
        actionGame.run();
        System.out.println("\n\n\n");

        // Create and run a racing game
        Game racingGame = new RacingGame(inputHandler, uiElement, audioManager, isMultiplayer);
        racingGame.run();
        System.out.println("\n\n\n");
        // Create and run a strategy game
        Game strategyGame = new StrategyGame(inputHandler, uiElement, audioManager, isMultiplayer);
        strategyGame.run();
        System.out.println("\n\n\n");


        // Display scores
        System.out.println("Action Games.Game Scores: " + actionGame.score);
        System.out.println("Racing Games.Game Scores: " + racingGame.score);
        System.out.println("Strategy Games.Game Scores: " + strategyGame.score);*/
    }
}