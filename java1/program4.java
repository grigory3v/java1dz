// Реализовать простой калькулятор 
// (введите первое число, введите второе число, 
// введите требуемую операцию, ответ)

import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        float answer;
        String number1, number2, oper;
        char operationSign;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оперцию(+,-,*,/):");
        oper = scanner.next();
        operationSign = oper.charAt(0);

        System.out.print("Введите первое число: ");
        number1 = scanner.next();
        float numberFloat1 = Float.parseFloat(number1);

        System.out.print("Введите второе число: ");
        number2 = scanner.next();
        float numberFloat2 = Float.parseFloat(number2);
        
        if (operationSign == '+'){
            answer = numberFloat1 + numberFloat2 ;
            System.out.println("Ответ: " + answer);
        }

        if (operationSign == '-') {
            answer = numberFloat1 - numberFloat2;
            System.out.println("Ответ: " + answer);
        }

        if (operationSign == '*') {
            answer = numberFloat1 * numberFloat2;
            System.out.println("Ответ: " + answer);
        }

        if (operationSign == '/') {
            answer = numberFloat1 / numberFloat2;
            System.out.println("Ответ: " + answer);
        }
        
    }
}