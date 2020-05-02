package lesson1Advanced;

/* Мое имя
Вывести на экран любой символ пирамидкой в обратную сторону высотой в 10 строк.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом
*/

public class Task3 {

    public static void main(String[] args) {
        String s = " ";
        String n = "/";
        int number = 0;
        for (int a = 0; a < 10; a++) {
            number++;
            int i = 0;
            i = i+number; //i=1 for the 1st operation
            int j = 10;
            j = j-number; //j=9 for the 1st operation
            //System.out.println(j+" and "+i); - checking my counters.

            while (i!=10){
                System.out.print(s);
                i++;
            }
            while (j!=10){
                System.out.print(n);
                j++;
            }
            System.out.println();
        }
    }}