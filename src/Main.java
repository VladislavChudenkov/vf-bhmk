import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную:");
        int a = scanner.nextInt();
        System.out.println("Введите вторую переменную:");
        int b = scanner.nextInt();
        System.out.println("Введите третью переменную:");
        int c = scanner.nextInt();
        if ((a^2 + b^2) == (c^2) ||
                (b^2 + c^2) == (a^2) ||
                (c^2 + a^2) == (b^2))
        {
            System.out.println("Треугольник является прямоугольным");
        }
        else if ( a == b || b == c
                 || c == a
                )
        {
            System.out.println("Треугольник является равнобедренным");
        }
        else if (a == b && a == c)
        {
            System.out.println("Треугольник является равносторонним");
        }
        else if ( a + b <= c || b + c <= a || c + a <= b )
        {
            System.out.println("Переменные не являются сторонами треугольника");
        }
        else
        {
            System.out.println("a, b и c являются сторонами обычного треугольника");

        }
    }
}