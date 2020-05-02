package lesson1Advanced;

public class Task1 {
    /* Минимум n чисел
    Написать функцию, которая вычисляет минимум из массива чисел.
    */
    public static void main(String[] args) {

        int a[]={-5,10,-1,5,7,-9,100,0,-2,-19,12,3,1,4,6,7,-1,-100,-8,-3,83};
        int b[]={1,2,3};
        int c[]={2,4,6,1,90,2,0};
        System.out.println(min(a));
        System.out.println(min(b));
        System.out.println(min(c));

    }

    public static int min(int[] a) {
        int n=0; //using this int to track operation # to better understand logic during development
        int minValue = 0;
        int j=0;
        int i=0;
        while(j!= a.length){
        for (int minIndexI; i != a.length; i++) {
            //System.out.println(n+". "+a[i]+" is smaller then "+a[j]); //tracking what operation # is done
            n++;
            if (a[i] < a[j]) {
                minIndexI =i; //here I track index of the minimal value
                minValue=a[i];
                //System.out.println("min index= "+minIndexI); //tracking what is min index of the min value
                //System.out.println(minValue);  //tracking what is min value
                break;
            }
            else minValue=a[j]; //if 1st array element is min value setting it as minValue
        }
        j++;
       }

    return minValue;
    }
}

