package Глава7_Рассмотрение_классов_и_методов._203_204_Static._203_UseStatic;

class UseStatic {
    static int a = 3;
    static int b;

    static void println(int x){
        System.out.println("" + x);
        System.out.println("" + a);
        System.out.println("" + b);
    }

    static {
        System.out.println("Статический блок инициализирован");
        b = a * 4;
    }

    static {} static {} static {}

    public static void main(String[] args) {
        println(42);System.out.println("запись");
    }
    // как видно в статических переменных и методах выполняются все статиче
}


