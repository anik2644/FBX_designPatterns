package Games_Components;

public abstract class Level {
    public String levelName;
    public int difficulty;
    public boolean isCompleted;

    public Level(String levelName, int difficulty) {
        this.levelName = levelName;
        this.difficulty = difficulty;
        this.isCompleted = false;
    }

    public abstract void start();

    public abstract void update();

    public abstract void complete();
}
