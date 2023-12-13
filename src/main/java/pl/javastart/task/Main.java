package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Maths maths = new Maths();
        boolean isEven = maths.isEven(11);
        System.out.println(isEven);

        boolean isOdd = maths.isOdd(11);
        System.out.println(isOdd);

        double circleField = maths.circleField(3.5);
        System.out.println(circleField);

        int power = maths.power(3);
        System.out.println(power);
    }
}
