package lesson1;


/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String s = "Ross ";
        int i=0;
        int j=0;
        do {
            do {
                System.out.print(s);
                i++;
            }
            while (i<10);
            System.out.println();
            j++;
            i=0;
        }
        while (j<5);

        }
    }

