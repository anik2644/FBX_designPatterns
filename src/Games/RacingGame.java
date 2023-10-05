package Games;

import Games_Components.*;

public class RacingGame extends Game{
    public RacingGame(InputHandler inputHandler, UIElement uiElement, AudioManager audioManager, boolean isMultiplayer) {
        super(inputHandler, uiElement, audioManager, isMultiplayer);
    }

    @Override
    protected void setupLevels() {
        levels = new Level[]{
                new Level("Track 1", 1) {
                    @Override
                    public void start() {
                        System.out.println("Starting Racing Games.Game - " + levelName);
                    }

                    @Override
                    public void update() {
                        // Games.Game logic for the racing level
                        // Simulate physics engine
                        System.out.println("Racing through high-speed tracks and navigating tight corners...");

                        // Increase single-player score
                        Scoring(5);
                    }

                    @Override
                    public void complete() {
                        System.out.println("Completing Racing Games.Game - " + levelName);
                        isCompleted = true;
                    }
                }
        };
    }
    public String gameName()
    {
        return  " Racing Game  ";
    }

    @Override
    protected void playGame() {
        System.out.println("Playing Racing Games.Game");
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
