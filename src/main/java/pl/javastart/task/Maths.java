package pl.javastart.task;

public class Maths {
    boolean isEven(int arg) {
        return arg % 2 == 0;
    }

    boolean isOdd(int arg) {
        return arg % 2 != 0;
    }

    double circleField(double radius) {
        return Math.PI * (radius * radius);
    }

    int power(int arg) {
        return arg * arg;
    }
}
