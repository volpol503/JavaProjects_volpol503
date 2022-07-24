package Глава4_Операции;

public class Арифметические_операции {
//    Операция  Описание
//    +         Сложение
//    -         Вычитание
//    *         Умножение
//    /         Деление
//    %         Деление по модулю
//    ++        Инкремент приращение на 1
//    --        Декремент отрицательное приращение на 1
//    +=        Сложение с присваиванием
//    -=        Вычитание с присваиванием
//    *=        Умножение с присваиванием
//    /=        Деление с присваиванием
//    %=        Деление по модулю с присваиванием
//
}

//Продемонстрировать основные арифметические операции
class BasicMath{
    public static void main(String[] args) {
        //арифметические операции над
        //целочисленными значениями
        System.out.println("Целочисленная арифметика");
        int a = 1*1;
        int b = a*3;
        int c = b/4;
        int d = c-a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

    //арифметические операции над значениями типа double
        System.out.println("\n Арифметика с плавующей точкой");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("db = " + dc);
        System.out.println("db = " + dd);
        System.out.println("db = " + de);
    }
}

//Продемонстрировать применение операции %
class Арифметическкие_операции {
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("x mod 10 = " + y % 10);
    }
}

//Продемонстрировать применение нескольких операций с присваианием
class Equals{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double e = 2;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        e /= 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c + "\n" + "e = " + e);
    }
}



