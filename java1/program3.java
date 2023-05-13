// Вывести все простые числа от 1 до 1000 
// (числа, которые делятся только на 1 и на себя без остатка)

public class program3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0 | i % 5 == 0)
                ;
            else
                System.out.println(i);
        }

    }

}