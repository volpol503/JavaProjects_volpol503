package Глава10_Обработка_исключений._287_try_in;

import javax.security.sasl.SaslServer;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class NetsTry {
    public static void main(String[] args) {

        BufferedImage BI;

        int a = args.length;
        a = 3;
        int b = 42/ a;
        System.out.println("a = " + a);

        try {
        if(a == 1)  a = a/(a - a); // деление на нуль
        /*
        Если указан один аргумент командной
        строки, то исключение в связи с делением на
        нуль  будет сгенерированно  следующем коде
        */
        if (a == 2){
            int c[] = {1};
            c[42] = 99;
            //здесь генерируется исключение
            //в связи с входом за пределы массива
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс за пределами массива" + e);
        }
        catch (ArithmeticException e){
            System.out.println("Деление на нуль" + e);
        }
    }
}


class TryNotify {
    static void nest_try(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);
                //деление на нуль
            }
            //Если указан два аргумента командной строки, то
            //генерируется исключение связи с выходом
            //за пределами массива
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива" + e);
        }
    }

    public static void main(String[] args) {
        try { }
        catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
