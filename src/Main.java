import Classes.Colibry;
import Classes.Human;
import Interfaces.Bird;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Bird kek = new Colibry();
        Human bald = new Human(20, 'm');
        bald.drinkMilk();
        bald.eat(1);
        bald.sleep();
        kek.eat(3);
        bald.sound();
        kek.sound();
        bald.killAnimal(kek);
        bald.eat(6);
        bald.die();
        System.out.println(bald.getDead());

    }

    public static void simpleCount(int n) {
        boolean flag = false;

        for (double i = 2; i <= n; i++) {
            for (double j = i - 1; j >= 2; j--) {
                if ((i % j) == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println(i);
            flag = false;
        }
    }

    public static double[] SquareEquation(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        double[] result = new double[2];
        if (d < 0) {
            return null;
        } else {
            if (d == 0) {
                result[0] = -b / a;
            } else {
                result[0] = (-b + Math.sqrt(d)) / 2 * a;
                result[1] = (-b - Math.sqrt(d)) / 2 * a;
            }
        }
        return result;
    }
}
