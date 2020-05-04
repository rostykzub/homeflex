package lesson2;

import java.sql.SQLOutput;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {

    public static void main(String[] args) {

        Task1 Ross = new Task1(11,"Ross","Child");

        Ross.setAge(150);
        System.out.println(Ross.getAge());
        Ross.setAge(-20);
        System.out.println(Ross.getAge());
        Ross.setName("12");
        System.out.println(Ross.getName());
        Ross.setName("   ");
        System.out.println(Ross.getName());
        Ross.setName("rostylav");
        System.out.println(Ross.getName());
        Ross.setAge(55);
        System.out.println(Ross.getAgeGroup());
        Ross.setAgeGroup("NULL");
        System.out.println(Ross.getAgeGroup());

    }

        private static int age;
        private static String name;
        private String ageGroup;

        public Task1(int age,String name, String ageGroup){
            this.age = age;
            this.name = name;
            this.ageGroup = ageGroupSelector();
        }

    private String ageGroupSelector() {  //create a method - selector of the correct age group.
            if (this.getAge()<15){
                ageGroup="child";
            }
            else if (this.getAge()>14 && this.getAge()<26){
               ageGroup="student";
            }
            else if (this.getAge()>25 && this.getAge()<66){
                ageGroup="worker";
            }
            else if(this.getAge()>=66){
                ageGroup="pensioner";
            }
        return ageGroup;
    }

    // Getters
    public int getAge () {
        return age;
    }
    public String getName () {
        return name;
    }
    public String getAgeGroup () {
        return ageGroup;
    }
    //Setters
    public void setAge ( int age){
        if ((age >= 0) && (age <= 100)){
            this.age = age;
            this.ageGroupSelector();// - if ageGroup setter was called, I'm also calling my Group selector.
        }
        else {
            System.out.println("Age should be bigger then 0 and less then 100");
        }
    }
    public void setName (String name){
            if (name.length() < 3 || name.length() >50){
                System.out.println("Name should be at least 3 and maximum 50 chars long");
            }
            else if (name.trim().length()==0){
                System.out.println("Name should not consist only of spaces");
            }
            else{
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                this.name = name;
            }

    }
    private void setAgeGroup (String ageGroup) {
        this.ageGroup = ageGroup;
    }


}