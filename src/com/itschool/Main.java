package com.itschool;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double answer, a, b, c;

	    System.out.println("Программа вычисляет значения переменной 'answer' по формуле №1");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменной 'а' которое не должно равняться '0':");
        a = in.nextDouble();
        System.out.println("Введите значение переменной 'b'");
        b = in.nextDouble();
        System.out.println("Введите значение переменной 'с'");
        c = in.nextDouble();

        if (a == 0){
            System.out.println("Решение невозможно так как а = 0.");
        }
        else {
            answer = Math.pow(b, 2) + 4 * a * c;
            if (answer < 0){
                System.out.println("Решение не возможно: квадратный корень из отрицательного числа...");
            }
            else {
                answer = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
                System.out.println("Резутьтат: answer = " + answer);
            }
        }
    }
}
