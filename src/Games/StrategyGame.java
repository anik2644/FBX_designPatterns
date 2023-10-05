package Games;

import Games_Components.*;

public class StrategyGame extends Game {
    public StrategyGame(InputHandler inputHandler, UIElement uiElement, AudioManager audioManager, boolean isMultiplayer) {
        super(inputHandler, uiElement, audioManager, isMultiplayer);
    }

    @Override
    protected void setupLevels() {
        levels = new Level[]{
                new Level("Games.Level 1", 1) {
                    @Override
                    public void start() {
                        System.out.println("Starting Strategy Games.Game - " + levelName);
                    }

                    @Override
                    public void update() {
                        // Games.Game logic for the strategy level
                        // Simulate physics engine
                        System.out.println("Commanding armies and strategizing movements...");
                        // Increase team score
                        Scoring(20);
                    }

                    @Override
                    public void complete() {
                        System.out.println("Completing Strategy Games.Game - " + levelName);
                        isCompleted = true;
                    }
                }
        };
    }
    public String gameName()
    {
        return  " Strategy Game  ";
    }

    @Override
    protected void playGame() {
        System.out.println("Playing Strategy Games.Game");
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
