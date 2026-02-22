public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 007:");
        float a = 3;  // float для "%" и для "/"
        float b = 4;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("b - a = " + (b - a));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println();

        System.out.println("Задание 008:");
        int k = 5;

        // можно сделать как мазахист:
        // System.out.println(2 + " x " + k + " = " + (2 * k));
        // System.out.println(3 + " x " + k + " = " + (3 * k));
        // и т.д.

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + " x " + k + " = " + (i * k));
        }
    }
}