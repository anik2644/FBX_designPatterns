package Games_Components;

// Common abstract class for games
public abstract class Game {
    protected InputHandler inputHandler;
    protected UIElement uiElement;
    protected AudioManager audioManager;
    protected Level[] levels;
    protected boolean isMultiplayer;
    public Score score; // Use the Score class for scoring

    public Game(InputHandler inputHandler, UIElement uiElement, AudioManager audioManager, boolean isMultiplayer) {
        this.inputHandler = inputHandler;
        this.uiElement = uiElement;
        this.audioManager = audioManager;
        this.isMultiplayer = isMultiplayer;
        this.score = new Score(); // Initialize Score object
        setupLevels();
    }

    // Common scoring system functions

  public void setNoOfPlauyer(int num)
  {
      if(num>1)
      {
          isMultiplayer = true;
      }
      else
      {
          isMultiplayer = false;
      }
  }
    public int getScore()
    {
        if(isMultiplayer){
            return  score.getTeamScore();
        }
        else{
            return  score.getSinglePlayerScore();
        }
    }
    public void Scoring(int points)
    {
        if(isMultiplayer){
            increaseTeamScore(points);
        }
        else{
            increaseSinglePlayerScore(points);
        }
    }
    private void increaseSinglePlayerScore(int points) {
        score.increaseSinglePlayerScore(points);
    }

    private void increaseTeamScore(int points) {
        score.increaseTeamScore(points);
    }

    protected abstract void setupLevels();

    public void run() {
        displayUI();
        inputHandler.handleInput();
        playSoundtrack();
        playGame();
    }

    protected abstract void playGame();

    protected void displayUI() {
        uiElement.display();
    }

    protected void playSoundtrack() {
        audioManager.playMusic("Games.Game Soundtrack");
    }
}
