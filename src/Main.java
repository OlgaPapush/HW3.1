// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        for (int i = 1; i<11;i++){
        System.out.println(i);}

        System.out.println("Task2");
        for (int i = 10; i>0;i--){
            System.out.println(i);}

        System.out.println("Task3");
              for (int i = 0; i<17; i =i+2){
            System.out.println(i);}

        System.out.println("Task4");
        for (int i = 10; i>-11;i--){
            System.out.println(i);}

        System.out.println("Task5");
        for (int i = 1904; i<2096;i = i+4){
            System.out.println(i + " год является високосным");}

        System.out.println("Task6");
        for (int i = 7; i<98; i =i+7){
            System.out.println(i);}

        System.out.println("Task7");
        for (int i = 1; i<512; i =i *2){
            System.out.println(i);}

        System.out.println("Task8");
        int salary  = 29000;
        int total = 0;
        for (int i = 1; i<13; i ++){
           total = total+salary ;
        System.out.println("Месяц" + i + "сумма накоплений равна " + total);}

        System.out.println("Task9");
        int salary1  = 29000;
        int total1 = 0;
        for (int i = 1; i<13; i ++){
            total1 = total1 + total1/100;
            total1 = total1+salary1 ;
            System.out.println("Месяц" + i + "сумма накоплений равна " + total1);}

        System.out.println("Task10");
        int a = 2;
        for (int i=1; i<11; i= i+1){
        System.out.println(a + "*" + i + "=" +(i*a));
        }






    }
}