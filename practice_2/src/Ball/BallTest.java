package Ball;

public class BallTest {
    public static void main(String[] args){
        Ball b1 = new Ball(120,150);
        Ball b2 = new Ball(130,230);
        System.out.println(b1);
        System.out.println(b2);
        b1.move(32,25);
        b2.move(43,30);
        System.out.println(b1);
        System.out.println(b2);
    }
}
