package Глава9_Пакеты_и_интерфейсы._254_acsses_package.P1;

public class Protection {
    int n = 1;
    private int  n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection(){
        System.out.println("Констуктор базового класса");
        System.out.println("n = " + n);

        System.out.println("n_pri - private   | = " + n_pri);
        System.out.println("n_pro - protected | = " + n_pro);
        System.out.println("n_pub - public    | = " + n_pub);

    }

}