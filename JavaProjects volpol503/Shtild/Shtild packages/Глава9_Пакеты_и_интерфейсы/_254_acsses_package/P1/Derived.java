package Глава9_Пакеты_и_интерфейсы._254_acsses_package.P1;

public class Derived extends Protection {
    Derived(){

        System.out.println("Конструктор подкласса : extends Protection() ");
        System.out.println("n =" + n);

        //Доступно только для класса
        //System.out.println("n_pri" + n_pri);

        System.out.println("n_pro" + n_pro);
        System.out.println("n_pub" + n_pub);
    }
}