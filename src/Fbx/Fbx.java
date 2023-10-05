package Fbx;

import Authentication.AuthenticationManager;
import Games.ActionGame;
import Games.RacingGame;
import Games.StrategyGame;
import Games_Components.AudioManager;
import Games_Components.Game;
import Games_Components.InputHandler;
import Games_Components.UIElement;

public class Fbx {

    public AuthenticationManager Authentication = new AuthenticationManager();

    InputHandler inputHandler = new InputHandler() {
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


    Game actionGame_single = new ActionGame(inputHandler, uiElement, audioManager, false);
    Game actionGame_multi = new ActionGame(inputHandler, uiElement, audioManager, true);

    Game racingGame_single = new RacingGame(inputHandler, uiElement, audioManager, false);
    Game racingGame_multi = new RacingGame(inputHandler, uiElement, audioManager, true);

    Game strategyGame_single = new StrategyGame(inputHandler, uiElement, audioManager, false);
    Game strategyGamemulti = new StrategyGame(inputHandler, uiElement, audioManager, true);





   public Game PrepareGame(String gameName, int noPlayers)
   {
       if(Authentication.isLoggedIn())
           {
               if(gameName == "actionGame")
               {
                   if(noPlayers==1){
                       return actionGame_single;
                   }
                   else {
                       return actionGame_multi;
                   }
               }
               else if(gameName == "racingGame")
               {
                   if(noPlayers==1){
                       return racingGame_single;
                   }
                   else {
                       return racingGame_multi;
                   }
               }
               else {
                   if(noPlayers==1){
                       return strategyGame_single;
                   }
                   else {
                       return strategyGamemulti;
                   }
               }
           }
       else
           return null;

   }


}
