import processing.core.PApplet;

public class Score extends PApplet {

    private int score = 0;
    private PApplet sketch;
    public Score(PApplet sketch) {

        this.sketch = sketch;
    }

    public void display() {
        this.sketch.fill(255);
        this.sketch.textSize(20);
        this.sketch.text("Score: " + this.score, 20, 25);
    }

    public void update() {
        // if collideswith == true
            //score++
    }

}
