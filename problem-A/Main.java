public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1, 7, 3, 2);
        MovableCircle c = new MovableCircle(45, 45, 5, 5, 15);

        System.out.println(c);
        for (int i = 0; i < 3; i++) {
            c.moveDown();
            System.out.println(c);
        }
        for (int i = 0; i < 3; i++) {
            c.moveRight();
            System.out.println(c);
        }

        Movable[] m = new Movable[5];
        for (int i = 0; i < m.length; i++) {
            m[i] = new MovablePoint(i, i, 4, 8);

            System.out.println(m[i]);
        }
    } 
}
