package CheatCodeMAnager;

import Gamers.Gamer;
import Games_Components.Game;

public class CheatCodeManager {
    private static CheatCodeManager instance;
    private String[] cheatCodes;
    private int[] gameIds;
    private int size;

    public CheatCodeManager() {
        cheatCodes = new String[100]; // Adjust the size as needed
        gameIds = new int[100];       // Adjust the size as needed
        size = 0;
    }

    public static CheatCodeManager getInstance() {
        if (instance == null) {
            instance = new CheatCodeManager();
        }
        return instance;
    }

    public void addCheatCode(String cheatCode, int gameId) {
        if (size < cheatCodes.length) {
            cheatCodes[size] = cheatCode;
            gameIds[size] = gameId;
            size++;
        } else {
            System.out.println("Cheat code storage is full.");
        }
    }

    public boolean applyCheat(String cheatCode, String playerName) {
        for (int i = 0; i < size; i++) {
            if (cheatCodes[i].equals(cheatCode)) {
                int gameId = gameIds[i];

                System.out.println( gameId +" : Be moral on next time... ");
            }
        }
        System.out.println("Cheat code " + cheatCode + " not found.");
        return false;
    }

    public void detectCheatCode(String cheatCode)
    {
        System.out.println(cheatCode + "  this is a Cheat Code");
        System.out.println("Be moral!!!!!!!");
    }
}
