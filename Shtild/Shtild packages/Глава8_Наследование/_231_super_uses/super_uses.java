package Глава8_Наследование._231_super_uses;

public class super_uses {
}
//Использовать ключевое слово super
//с целью предотвратить сокрытие имен

class A {
    int A;
}

class B extends A {
    int i; // Этот член i из класса A
}