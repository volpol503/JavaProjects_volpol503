package Глава8_Наследование._231_super_uses;

public class super_uses {
}
//Использовать ключевое слово super
//с целью предотвратить сокрытие имен

class A {
    int i;
}

class B extends A {
    int i; // Этот член i скрывает член i из класса A
    B(int a, int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}


class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1,2);
        subOb.show();
    }
}


