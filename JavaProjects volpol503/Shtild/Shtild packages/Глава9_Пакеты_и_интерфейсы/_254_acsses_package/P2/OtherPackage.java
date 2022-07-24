package Глава9_Пакеты_и_интерфейсы._254_acsses_package.P2;

import Глава9_Пакеты_и_интерфейсы._254_acsses_package.P1.Protection;

public class OtherPackage {
    OtherPackage(){
        Глава9_Пакеты_и_интерфейсы._254_acsses_package.P1.Protection p = new Protection();

        // доступно только для данного класса или пакета
        // System.out.println("n = " + p.n);

        //доступно только для данного класса
        //System.put.println("n_pri = " + n_pri);

        //доступно только для данного класса подкласса или пакета
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
