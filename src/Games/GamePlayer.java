package Games;

import Games_Components.Game;

public class GamePlayer {

    public Game game ;
    int NoPlayers;
    public GamePlayer(Game game, int NoPlayers)
    {
        this.game = game;
        this.NoPlayers = NoPlayers;
        setPlayermode(NoPlayers);
    }

    private void setPlayermode(int noPlayers) {
        game.setNoOfPlauyer(noPlayers);
    }

    public void Play()
    {
        System.out.println("\n\n"+game.gameName() + " is loading");
        game.run();
    }
}
