package mydie;

import java.util.Random;

public class MyDie {
    Random random = new Random();
    private int dieValue;

    public int getDieValue() {
        return dieValue;
    }

    public void roll() {
        dieValue = random.nextInt(6) + 1;
    }

    public MyDie() {
        roll();
    }
}
