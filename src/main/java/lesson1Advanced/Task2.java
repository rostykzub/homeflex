package lesson1Advanced;

/* Мое имя
Вывести на экран любой символ пирамидкой высотой в 10 строк.
*
**
***
****
*****
******
*******
********
*********
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом
*/

public class Task2 {

    public static void main(String[] args) {
        String s = "\\";
        String n = "\\";
        int i=0;
        while (i!=9){
            System.out.println(s); //1 time using System.out.println
            i++;
            s +=n;
        }
        if (i==9){
            System.out.print(s); // 1 time using System.out.print :)
        }
    }
}