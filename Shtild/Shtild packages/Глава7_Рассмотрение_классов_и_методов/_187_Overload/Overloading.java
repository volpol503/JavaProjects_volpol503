package Глава7_Рассмотрение_классов_и_методов._187_Overload;

public class Overloading {
}

//Продемонстрировать перегрузку методов
class OverloadDemo{
    void test(){
        System.out.println("параметры отсутствуют");
    }
    //Перегружаемый метод, проверяющий наличие двух целочисленных
    //параметров
    void test(int a, int b){
        System.out.println("a and b " + a  + " " + b);
    }
    //Перегружаемй метод, проверяющий наличие
    //параметра типа double
    void test(double a){
        System.out.println("число double a равно " + a);
    }
}
class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test();
        ob.test(10,20);
        ob.test(i);         //здесь вызыается вариант метода test(double)
        ob.test(1.2);    //и здесь вызывается вариант метода test(double)
    }
}




