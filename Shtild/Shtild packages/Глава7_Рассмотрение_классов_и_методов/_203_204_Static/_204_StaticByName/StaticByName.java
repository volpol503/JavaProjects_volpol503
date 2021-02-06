package Глава7_Рассмотрение_классов_и_методов._203_204_Static._204_StaticByName;

// Продемонстрировать статические переменные, метод и блоки кода
// статическим членом метода или переменной ключевым словом static

class StaticDemo{
    static int a = 42;
    static int b = 99;
    public int c = 12;
    static void callme(){
        System.out.println("a = " + a);
    }
    public void println(){
        System.out.println("c = " + c);
    }
}

class StaticByName{
    public static void main(String[] args) {

        StaticDemo St = new StaticDemo();
        //Вызов через конструктор
        St.callme();
        //Ссылка на класс и статический метод
        StaticDemo.callme();


        // Статические переменные в отличии от других доступных модификаторов
        // можно вызвать без вызова конструктора класса

        // Следующая запись доступного метода нельзя осуществить непосредственно
        // ссылаясь на класс >> метод
        // StaticDemo.println;
        St.println();
    }
}