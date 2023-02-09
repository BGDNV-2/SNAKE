import processing.core.PApplet;

public class Snake extends PApplet {

    private final PApplet sketch;
    public float x = this.width / 2f;

    public float y = this.height / 2f;
    public int xSpeed = 10;
    public int ySpeed = 0;

    public Snake(PApplet sketch) {
        this.sketch = sketch;
    }

    public void display() {
        this.sketch.fill(255); // The color is brighter than my future
        this.sketch.rect(this.x - GameLogic.CELL / 2f, this.y - GameLogic.CELL / 2f, GameLogic.CELL, GameLogic.CELL);
    }

    public void update() {

        this.x = this.x + this.xSpeed  * GameLogic.CELL / 30f;
        this.y = this.y + this.ySpeed  * GameLogic.CELL / 30f;

    }

    public void snakeStop() {
        if (this.x < 0 || this.x > this.sketch.width || this.y < 0 || this.y > this.sketch.height) {
            this.xSpeed = 0;
            this.ySpeed = 0;

            this.sketch.textSize(50);
            this.sketch.text("Game Over", this.sketch.width / 2f - 100, this.sketch.height / 2f);
        }
    }

    public void direction(int x, int y) {
        this.xSpeed = x;
        this.ySpeed = y;
    }
}