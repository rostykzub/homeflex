package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
        String s = "Ross ";
        int i=0;
        int j=0;

        while (i<5) {
            while (j < 10) {
                System.out.print(s);
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }
    }
}