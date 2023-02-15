public class DrawBall {

    public static void main(String[] arguments) {

        GameArena arena = new GameArena(500, 500);

        Ball newBall = new Ball(250, 250, 5, "BLUE");

        arena.addBall(newBall);

        while (true) {
            double value = newBall.getXPosition();
            newBall.setXPosition(value + 1);
            arena.pause();
            if(value == 500)
            {
                newBall.setXPosition(value - 1);
            }

        }
    }
}
