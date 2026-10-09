package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int a = 10;
        int b = 5;
        int x = 10;
        double y = 3.5;
        int maxInt = Integer.MAX_VALUE;
        // Арифметические операции над двумя int
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
        // Арифметические операции с int и double
        System.out.println("Сложение: " + (x + y));
        System.out.println("Вычитание: " + (x - y));
        System.out.println("Умножение: " + (x * y));
        System.out.println("Деление: " + (x / y));
        // Логические операции сравнения
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        // Минимальные и максимальные значения типов
        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("После переполнения: " + (maxInt + 1));
    }
}
