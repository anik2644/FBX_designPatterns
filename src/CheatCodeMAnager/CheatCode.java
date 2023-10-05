package CheatCodeMAnager;

public class CheatCode {

    public String cheatcode;
    public CheatCode(String cheatcode)
    {
        this.cheatcode = cheatcode;
    }
    CheatCodeManager cheatCodeManager = new CheatCodeManager();
    public void run(String cheatCode)
    {
        cheatCodeManager.detectCheatCode(cheatCode);
    }
}
