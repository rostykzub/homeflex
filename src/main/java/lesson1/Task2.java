package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/


public class Task2 {

    public static void main(String[] args) {
        printMyNamex10("Ross");
    }

    public static String printMyNamex10 (String name){
        String test = "";

        for (int j=0;j<5;j++) {
            for (int i = 0; i <= 10; i++) {
                if (i <= 9) {
                    test = test + name + ' ';
                } else
                    test = test.substring(0,test.length()-1) + "\n";
            }
        }
        System.out.print(test);
        return test;
    }
}