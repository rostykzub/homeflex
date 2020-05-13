package lesson1;

//import sun.jvm.hotspot.HelloWorld;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
       System.out.println(reverse("HelloWorld!!!"));
       System.out.println(reverse("Maria is dezigner"));

    }

   public static String reverse(String str) {
        int i = (str.length()-1);
       //System.out.println(i);
        String cutStr = "";
        while (i>-1){
            //System.out.println("cycle1= "+i);
            cutStr = cutStr+String.valueOf(str.charAt(i));
            i--;
            //System.out.println(cutStr);
        }
        str=cutStr;
        return str; }}