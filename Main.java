import processing.core.PApplet;

public class Main extends PApplet{
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        String[] tempArgs = new String[1];
        tempArgs[0] = "GameLogic";
        PApplet.runSketch(tempArgs, gameLogic);
    }


}