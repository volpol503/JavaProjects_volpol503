package Глава8_Наследование._221_classextends;

public class class_extends {
}

class A {
    int i,j;
    void showij(){
        System.out.println("i и j: " +  i + " " + j);
    }
}

//создать суперкласс путем расширения класса A
class B extends A {
    int k;
    void showk(){
     System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + j + k" + i + j + k);
    }

}

class SimpleInterstice {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //Суперкласс может использоваться смасостоятельно
        superOb.i = 11;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb "); superOb.showij();
        /* Подкласс имеет доступ ко всем открытым членам своего */
        subOb.i = 6;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb");

    // Идея данного примера показать что когда класс раширяется
    // добавляя слово extends добавляются методы переменные что
    // в суперклассе в этом случае subOb может принять больше
    // параметров чем суперкласс

    }
}














