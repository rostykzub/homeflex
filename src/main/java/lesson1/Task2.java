package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
        printMyNamex10();
    }

    public static void printMyNamex10 (){
        String s = "Ross ";
            for (int j=0;j<5;j++) {

                for (int i=0;i<10;i++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}