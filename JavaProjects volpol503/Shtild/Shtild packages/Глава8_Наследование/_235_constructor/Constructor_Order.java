package Глава8_Наследование._235_constructor;

public class Constructor_Order {
}

class A{
    A(){System.out.println("Класс A Конструктор А");}
}

class B extends A{
 B(){System.out.println("Класс B внутри конструктора A"); }
}

class C extends B{
    C(){ System.out.println("Класс С внутри конструктора B"); }
}

class  CallCons{
    public static void main(String[] args) {

        //из за чего  вызывается конструктор A, B, C
        C c = new  C();
    }
}
