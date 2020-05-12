package lesson1;

import org.testng.annotations.Test;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */

    public static int min(int a, int b, int c) {
        if (a<b && a<c) {
            return a;
        } else if (b<c) {
            return b;
        } else {
            return c;
        }
    }
}

