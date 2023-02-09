import processing.core.PApplet;

public class Food extends PApplet {

    private  float xCoordinate = (float) (Math.random() * 1f - 720f);
    private float yCoordinate = (float) (Math.random() * 1f - 720f);

    private PApplet sketch;
    public Food(PApplet sketch) {

        this.sketch = sketch;
    }

    public void display() {
        this.sketch.fill(255,0,0);
        this.sketch.circle(xCoordinate, yCoordinate, GameLogic.CELL);
    }

    public boolean collidesWith(Snake snake) {
        if(this.xCoordinate < snake.x) {
            if (this.xCoordinate + GameLogic.CELL > snake.x) {
                if (this.yCoordinate < snake.y) {
                    return this.yCoordinate + GameLogic.CELL > snake.y;
                }
            }
        }
        return false;
    }

}


