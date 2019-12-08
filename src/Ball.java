import java.awt.*;
import java.util.Random;

public class Ball implements Runnable {

    Animator animator;

    int x = 50;
    int y = 50;

    public Ball() {
    }

    @Override
    public void run() {
        int step = 5;
        for (int i = 0; i < 1_000_000_000; i++) {
            try {
                Thread.sleep(30);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (x >= 50 && x < 1_100 && y <= 50) {
                x += step;
            } else {
                if (x == 1_100 && y < 700 && y >= 50) {
                    y += step;
                } else {
                    if (x <= 1_100 && x > 50 && y == 700) {
                        x -= step;
                    } else {
                        if (x >= 50 && y <= 700 && y > 50) {
                            y -= step;
                        }
                    }
                }

                /*x -= step;
                step *= -1;*/
            }
//
        }
    }
}
