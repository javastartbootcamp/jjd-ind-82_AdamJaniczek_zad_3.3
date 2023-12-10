package pl.javastart.task;

public class Maths {
    boolean isEven(int arg) {
        if (arg % 2 > 0) {
            return false;
        }
        return true;
    }

    boolean isOdd(int arg) {
        if (arg % 2 > 0) {
            return true;
        }
        return false;
    }

    double circleField(double radius) {
        return Math.PI * (radius * radius);
    }

    int power(int arg) {
        return arg * arg;
    }
}
