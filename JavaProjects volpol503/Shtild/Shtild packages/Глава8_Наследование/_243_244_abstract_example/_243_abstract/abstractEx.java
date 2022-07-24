package Глава8_Наследование._243_244_abstract_example._243_abstract;

public class abstractEx {
}

abstract class A{
    abstract void call_me();

    //абстрактные классы все же могут содержать конкретные методы

    void call_me_Next(){
        System.out.println("Это конкретный метод");
    }
}

class B extends A{
    void  call_me(){
        System.out.println("Реализация метода callme() в классе B");
    }
}

class AbstractDemo{
    public static void main(String[] args) {
    B b = new B();

    b.call_me();
    b.call_me_Next();
    }
}


