package Глава8_Наследование._246_final;

public class FinalExtends {
}



class A {
    final void handle(){
        System.out.println("Это конечный метод");
    }
}

class b extends A{
    // void handle(){} ошибка этот
    // метод не может быть переопределен

}

