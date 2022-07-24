package Глава9_Пакеты_и_интерфейсы._254_acsses_package.P1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("конструктор из того же самого пакета");
        System.out.println("но не унаследованный");

        //Доступно только для класса
        //System.out.println("n_pri" + p.n_pri);

        System.out.println("n" + p.n);
        System.out.println("n_pro" + p.n_pro);
        System.out.println("n_pri" + p.n_pub);
    }
}
