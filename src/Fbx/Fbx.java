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
    Game racingGame_single = new RacingGame(inputHandler, uiElement, audioManager, false);
    Game strategyGame_single = new StrategyGame(inputHandler, uiElement, audioManager, false);




   public Game PrepareGame(String gameName)
   {
        ;
       if(Authentication.isLoggedIn())
           {
               if(gameName == "actionGame")
               {
                   return actionGame_single;
               }
               else if(gameName == "racingGame")
               {
                   return racingGame_single ;
               }
               else {
                   return strategyGame_single;
               }
           }
       else
           return null;

   }


}
