public class Task008 {
    static void main() {
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
