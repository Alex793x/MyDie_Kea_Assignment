package mydie;

public class TestMyDie {

    public static void run() {
        MyDie die1 = new MyDie();
        MyDie die2 = new MyDie();

        System.out.println(die2.getDieValue());
        System.out.println(die1.getDieValue());


    }

    public static void main(String[] args) {
        run();
    }
}
