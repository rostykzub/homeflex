package lesson1Advanced;

/*
Семантическое версионирование
Реализовать метод который принимает на вход две строки
с версиями программы ("1.0.1.2", "1.1.1.2")
и возвращает версию более ранней
Подсказка - для решения строки надо разбить на массивы
Про семантическое версионирование почитать можно здесь https://semver.org/lang/ru/
*/

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        String lovestVersion = minVersion("1.0", "2.0");
        System.out.println(lovestVersion);
    }

    public static String minVersion(String v1, String v2) {

        String[] arrV1 = v1.split("\\.");
        String[] arrV2 = v2.split("\\.");
        int size1 = arrV1.length;
        int size2 = arrV2.length;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = Integer.parseInt(arrV1[i]);
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = Integer.parseInt(arrV2[i]);
        }
        // at this point we have 2 integer arrays: arr1 and arr2, so we will work with them.

        String minVersion = "Latest version of the software: ";
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] > arr2[i]) {
                    minVersion = minVersion + v1;
                    break;
                } else if (arr1[i] < arr2[i]) {
                    minVersion = minVersion + v2;
                    break;
                } else {
                    continue;
                }
            }
            if (minVersion=="Latest version of the software: "){ //checking if compared versions are similar
                minVersion=("івіCompared versions are equal.\nLatest version of the software: "+v1);
            }
        return minVersion;
    }
}