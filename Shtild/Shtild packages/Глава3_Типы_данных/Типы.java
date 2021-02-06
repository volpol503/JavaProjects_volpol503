package Глава3_Типы_данных;

public class Типы {
    int а, Ь, с;            // объявление трех переменных типа int
                            // а, Ь и с типа int
    int d = 3, е, f = 5;    //объявление еще трех
                            //с инициализацией переменных d и f
    byte z = 22;            //инициализация переменной z
    double pi = 3.14159;    //объявление переменной pi и ее
                            //инициализация приблизительным
                            //значением числа пи
    char х = 'х';           //присваивание символа 'х' переменной х
}



//***********************************************************************
//Первый класс абзаца

//Пример динамической инициализации переменных
class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        //динамическая инициализация переменной c
        double с = Math.sqrt(a * a + b * b);
        System.out.println("Гиротенуза равна " + с);
    }
}

//Продемонстрировать применение типа данных char
class CharDemo {
    public static void main(String[] args) {
        char ch1,ch2;
        ch1 = 88; //Код символа X
        ch2 = 'Y';
        System.out.println("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}


//Символьные переменные ведут себя
//как целочисленные значения
class CharDemo2 {
    public static void main(String[] args) {
        char ch1;
        ch1 = 'X';
        System.out.println(" ch1 содержит " + ch1);
    }
}

//Продемонстрировать область видимости блока кода
class Scope{
    public static void main(String[] args) {
        int x;
        x = 10;
        if(x == 10){//Начало новой области построения
            int y = 20;//доступной только этому блоку кода
            //обе переменные x и y доступны только
            //в этой области действия
            System.out.println(" x и y " + x + " " + y);
        x = y * 2;
        }
        // y = 100 //ОШИБКА! Переменная y не доступна
        // в этой области действия, тогда как
        // переменная x доступна и здесь
        System.out.println("x равно " + x);
    }
}

//Продемонстрировать срок действия переменной
class LifeTime{
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++){
            int y = -1; // переменная y инициализируется при
                        // каждом вхождении в блок кода
            System.out.println("y равно " + y);
                    //здесь выводится значение -1
            y = 100;
            System.out.println("y теперь равно " + y);
//            Этот цикл выполнит вывод
//            консоли 3 раза значения y до и после
        }
    }
}

//Эту программу нельзя скомпилировать
class ScopeErr{
    public static void main(String[] args) {
        int bar = 1;
        {}{}{}{}{}{}{}{}{}{}{}{}{}
        {}{}{}{}{}{}{}{}{}{}{}{}{}
        {}{}{}{}{}{}{}{}{}{}{}{}{}
        {}{}{}{}{}{}{}{}{}{}{}{}
        {
            int bar1 = 5;//Новая переменная bar1
        }
//        {               //Создается новая область действия
//            int bar = 2;//Ошибка во времени компиляции -
//                        //Переменная bar уже определена
//
//        }
    }
}

// Продемонстрировать приведение типов byte int double

class Conversation{
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 32333.142;
        System.out.println("\nПреобразование типа int в тип byte");
        b = (byte) i;
        System.out.println(" i и b "+ i + " " + b);
        System.out.println("\nПреобразование типа double в тип int");
        i = (int) d;
        System.out.println(" d и i " + d + " " + i);
        System.out.println("\nОтступ восми строк " +
                "Преобразование типа double в тип byte");
        b = (byte) d;
        System.out.println(" d и b " + d + " " + b);
        System.out.println("\n\n\n\n\n\n\n\nОтступ восми строк ");
    }
}

class Promote{
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double g = .1234;
//        здесь переменная d равна переменной g
//        это показано на последней строчке кода метода main
        double result = (f * b)+(i / c)-(d * s);
        boolean a = (d == g);
        System.out.println((f * b) + " + " + (i / c)+ " - " + (d * s));
        System.out.println("result = " + result);
        System.out.println(a);
    }
}

//Последный класс в абзаце
//***********************************************************************

//Конец содержащего класса
//Все содержательные классы выписаны
//всего 8 содержательных классов в текущем классе


