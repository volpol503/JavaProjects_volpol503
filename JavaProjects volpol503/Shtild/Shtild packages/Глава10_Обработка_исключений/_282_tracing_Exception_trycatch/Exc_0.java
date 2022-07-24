package Глава10_Обработка_исключений._282_tracing_Exception_trycatch;

import java.util.Random;

public class Exc_0 {
    public static void main(String[] args) {
        int d = 0;
        int a = 42/d;
    }
}


class Exc_1{
   static void subroutine(){
       int d = 0;
       int a = 12 / d;
    }

   double b = 12;
   double a = 3;
    public double divide(){
       return a/b;
    }

    public static void main(String[] args) {

    }
    static class Other{
        public static void main(String[] args) {
            Exc_1 E = new Exc_1();
            System.out.println(E.divide());
            E.subroutine();
        }
    }
}


class Ex2 {
    public static void main(String[] args) {
        int d,a;
        try {//проконтролиовать блок кода
            d = 0;
            a = 42 / d;
            a = 32 / d;
            System.out.println("Это не будет введено");
        }catch(ArithmeticException e){//перехватить ошибку деления на нуль
            System.out.println("Деление на нуль");
        }
        System.out.println("После оператора catch");
    }
}

class HandleError{
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 12345;

        Random r = new Random();
        for(int i = 0;i < 32000; i++ ){
            try {
                b = r.nextInt();
                c = r.nextInt();
//                long e = b + 4 * 999999999L;
//                при добавлениии прибавочного значения вероятнось
//                вывода исключения снижается до минимума количества выводимх строк в консоль
                // этом вражении b/c где b и c  целые числа если b < c
                a = d/ (b/c);
            }catch (ArithmeticException e){
                System.out.println("Деление на нуль b < c поскольку b и с это int a = " + d + " / (b/c = 0) " + "b = " + b + " " + "c = " + c);
//             a = 5;
            }
//            System.out.println("c:" + c);
//            System.out.println("b:" + b);
//            System.out.println("a:" + a + "\n");
        }
    }
}





