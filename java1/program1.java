// Вычислить n-ое треугольного число
// (сумма чисел от 1 до n)

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        int number, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        number = scanner.nextInt();

        sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

}