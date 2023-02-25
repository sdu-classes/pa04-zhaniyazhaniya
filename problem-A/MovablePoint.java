public class MovablePoint implements Movable{

    int x;
    int y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xs, int ys){
        this.x = x;
        this.y = y;
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    public String toString(){
        return String.format("(%d, %d), speed=(%d, %d)", this.x, this.y);
    }
    
    
    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
}
