import processing.core.PApplet;

public class GameLogic extends PApplet {

    public static final int CELL = 30;
    private Snake snake;
    private Food food;
    private Score score;


    public void settings() {

        this.size(720,720);
        snake = new Snake(this);
        food = new Food(this);
        score = new Score(this);
    }


    public void draw () {
        this.background(0);

        this.snake.display();
        this.snake.update();
        this.snake.snakeStop();
        this.food.display();
        this.score.display();




    }

    @Override
    public void keyPressed() {

        // My pseudo name is Justin Case. I'm ready for everything

        if (keyCode == UP || keyCode == 119 || keyCode == 87) {
            this.snake.direction(0, -10);
        } else if (keyCode == DOWN || keyCode == 115 || keyCode == 83) {
            this.snake.direction(0, 10);
        } else if (keyCode == RIGHT || keyCode == 100 || keyCode == 68) {
            this.snake.direction(10, 0 );
        } else if (keyCode == LEFT || keyCode == 97 || keyCode == 65) {
            this.snake.direction(-10 , 0);
        }
    }
}
