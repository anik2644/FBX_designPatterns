package Games;

import Games_Components.*;

// Concrete classes for action, racing, and strategy-based games
public class ActionGame extends Game{
    public ActionGame(InputHandler inputHandler, UIElement uiElement, AudioManager audioManager, boolean isMultiplayer) {
        super(inputHandler, uiElement, audioManager, isMultiplayer);
    }

    @Override
    protected void setupLevels() {
        levels = new Level[]{
                new Level("Games.Level 1", 1)
                {
                    @Override
                    public void start() {
                        System.out.println("Starting Action Games.Game - " + levelName);
                    }

                    @Override
                    public void update() {
                        // Games.Game logic for the action level
                        // Simulate physics engine
                        System.out.println("Unleash the fury! It's time to dominate the battlefield...");

                        // Increase single-player score
                        Scoring(10);
                    }

                    @Override
                    public void complete() {
                        System.out.println("Completing Action Games.Game - " + levelName);
                        isCompleted = true;
                    }
                }
        };
    }

    public String gameName()
    {
        return  " Action Game  ";
    }

    @Override
    protected void playGame() {
        System.out.println("Playing Action Games.Game");
        for (Level level : levels) {
            level.start();
            while (!level.isCompleted) {
                level.update();
                if(getScore()>100)
                {
                    level.complete();
                }
            }

        }
    }
}
