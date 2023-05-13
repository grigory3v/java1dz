
// Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        int number, factorial;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        number = scanner.nextInt();

        factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }

}