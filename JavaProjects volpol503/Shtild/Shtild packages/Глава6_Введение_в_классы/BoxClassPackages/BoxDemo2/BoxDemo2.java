package Глава6_Введение_в_классы.BoxClassPackages.BoxDemo2;


public class BoxDemo2 {
}

class Box{
    double width;
    double height;
    double depth;
    double vol;
}


class TwoBox_Initialized {
    public static void main(String[] args) {
        Box myBox; //Ссылка на объект
        Box myBox_first = new Box();
        Box myBox_second = new Box();
        //myBox_second = null; //null Exception
        //эта переменная лишняя и не используется в выводе
        double vol;

        //вместо этой переменной загружается переменная также из класса Box
        //В этом примере видно что типы данных загруженные в конструкторе
        //другого класса можно инициализировать и обращаться к ним и к ним
        //особенно применимо то что внутри классов используются методы с разными
        //модификаторами и типом void который на самом деле обрабатывает данные
        //и возвращает их обратно в конструктор
        //Таким способом по другому есть вариант инициализировать метод внутри метода
        //main в классе который уже содержит ввывод в кнсоль

        //присвоить значения переменным экземпляра mybox_First
        myBox_first.width = 10;
        myBox_first.height = 20;
        myBox_first.depth = 15;
        //присвоить значения переменным экземпляра myBox_Second
        myBox_second.width = 3;
        myBox_second.height = 6;
        myBox_second.depth = 9;
        //расчитать объем первого парралелипипеда
        //расчитать объем второго параллелипипеда
        myBox_first.vol = myBox_first.width * myBox_first.height * myBox_first.depth;
        System.out.println("Объем равен " + myBox_first.vol);
        myBox_second.vol = myBox_second.width * myBox_second.height * myBox_second.depth;
        System.out.println("Объем равен " + myBox_second.vol);
    }
}