package Глава6_Введение_в_классы;

public class ClassBox {
    //В примерах класса Box показыается как взаимодействовать с классом с взовом его методов конструкторов
    //а также параметров методов или конструкторов в одном из 7 примеров класса Box и BoxDemo
    //где в каждом примере рассматривается отельный пример с вызовом методов конструкторов и их параметров
    //из за того что это расположено в одном классе они переименовываются по разному сначала идет класс Box
    //7 классов а затем вызывающий класс Box Demo и то же 7 классов
    //в отдельном пакете все эти примеры расположенны по отдельным 7 пакетам и называется
    //классы как Box и BoxDemo<номер примера>

}
class Box {
    double width;
    double height;
    double depth;
    double vol;
}

/*
Программа, использующая класс Box
Присвоить исходному файлу имя BoxDemo.java
 */

class BoxSysOutPrintln{
    double width;
    double height;
    double depth;
    //вывести объем паррралелипипеда
    void volume(){
        System.out.println("Объем равен");
        System.out.println(width * height * depth);
    }
    //в этом примере независимый метод для расчета
    double volumevol() {
        return width * height * depth;
    }
}

class BoxReturnValue{
    double width;
    double height;
    double depth;
    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
}


class BoxParameter{
    double width;
    double height;
    double depth;
    double volume(){
        return width * height * depth;
    }
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class BoxConstructor{
    double width;
    double height;
    double depth;
    //это конструктор класса Box
    BoxConstructor(){
        width = 12;
        height = 12;
        depth = 12;
    }
    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
    void SysOutPrintln(){
        System.out.println("Объем стандартного паррвлелипипеда равен" + volume());
    }
}


class BoxConstructorParametrezed{
    double width;
    double height;
    double depth;
    //это конструктор класса Box
    BoxConstructorParametrezed(double w, double h, double d){
        //не вводить в конструкторе цифры вместо букв иначе они после
        //инициализации им нельзя присвоить другое значение
        width = w;
        height = h;
        depth = d;
    }
    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
    void SysOutPrintln(){
        System.out.println("Объем стандартного паррвлелипипеда равен" + volume());
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        //присвоить значение переменным экземпляра myBox

        //Обращая внимание что здесь загружается
        //примитивные типы данных из конструктора класса
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        //расчитать объем параллелепипеда
        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("Объем равен:" + vol);
    }
}

//class TwoBox_Initialized {
class BoxDemo2 {
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




class  BoxDemo3{
    public static void main(String[] args) {
        BoxSysOutPrintln myBox1 = new BoxSysOutPrintln();
        BoxSysOutPrintln myBox2 = new BoxSysOutPrintln();
        double vol;
        //присвоить значение пременным экземпляра mybox1
        myBox1.width = 11;
        myBox1.height = 12;
        myBox1.depth = 13;
        //присвоить значение переменнм экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;
        //вывести объем первого парралелипипеда
        vol = myBox1.volumevol();//независимая инициализация метода
        myBox1.volume();
        //вывести объем второго параллелипипеда
        vol = myBox2.volumevol();//независимая инициализация метода
        myBox2.volume();
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        BoxReturnValue myBox1 = new BoxReturnValue();
        BoxReturnValue myBox2 = new BoxReturnValue();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volume();
        System.out.println("Объем первого параллелипипеда равен " + vol);
        vol = myBox2.volume();
        System.out.println("Объем второго парралелипипеда равен " + vol);
    }
}

//в этом примере применяется метод с параметрами
class BoxDemo5 {
    public static void main(String[] args) {
        BoxParameter myBox1 = new BoxParameter();
        BoxParameter myBox2 = new BoxParameter();
        double vol;
        myBox1.setDim(1,2,2);
        myBox2.setDim(3,6,9);
        vol = myBox1.volume();
        System.out.println("Объем первого парралелипипеда" + vol);
        vol = myBox2.volume();
        System.out.println("Объем второго параллелипипеда" + vol);
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        BoxConstructor myBox1 = new BoxConstructor();
        BoxConstructor myBox2 = new BoxConstructor();
        double vol;
        //в этом примере присвоение отличающиеся от стандартного
        myBox1.width = 13;
        vol = myBox1.volume();

        System.out.println("Объем стандартного параллелипипеда равен" + vol);
        vol = myBox2.volume();
        System.out.println("Объем стандартного параллелипипеда равен" + vol);
        //тот же вывод через метод
        myBox1.SysOutPrintln();
        myBox2.SysOutPrintln();

    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        BoxConstructorParametrezed myBox1 = new BoxConstructorParametrezed(10,20,15);
        BoxConstructorParametrezed myBox2 = new BoxConstructorParametrezed(3,6,9);
        double vol;
        vol = myBox1.volume();
        System.out.println(vol);
        //myBox1.SysOutPrintln();
        vol = myBox2.volume();
        System.out.println(vol);
        //myBox2.SysOutPrintln();
    }
}
