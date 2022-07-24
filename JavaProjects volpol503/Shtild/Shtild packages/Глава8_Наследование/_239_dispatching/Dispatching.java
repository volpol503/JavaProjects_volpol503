package Глава8_Наследование._239_dispatching;

public class Dispatching {

}

class A{
    void call_me(){
        System.out.println("В методе call_me() из класса A");
    }
}

class B extends A{
    //Переопределить иетод call_me()
    void call_me(){
        System.out.println("В методе call_me() из класса B");
    }
}

class C extends B{
    //Переопределить метод call_me()
    void call_me(){
        System.out.println("В методе call_me() из класса C");
    }
}

class Dispatch{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A reference;

        reference = a;        //пременная r ссылается на объект типа A
        reference.call_me();  //вызвать вариант метода call_me()
                              //определенный в классе A

        reference = b;        //пременная r ссылается на объект типа B
        reference.call_me();  //вызвать вариант метода call_me()
                              //определенный в классе B

        reference = c;        //пременная r ссылается на объект типа C
        reference.call_me();  //вызвать вариант метода call_me()
                              //определенный в классе C

    }
}
