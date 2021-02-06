package Глава7_Рассмотрение_классов_и_методов._185_OverloadDemo;

class OverloadDemo {

    void test(){
        System.out.println("Параметры отсутствуют");
    }

    //Перегружаемый метод, проверяющий наличие
    //двух целочисленнх параметров

    void test(int a){
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b){
        System.out.println( a + " " + b);
    }
    double test(double a){
        System.out.println("double: " + a);
        return a * a;
    }

}

class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(12);
        ob.test(12,0);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test" + result);
    }
}

