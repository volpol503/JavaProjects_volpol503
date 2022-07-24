package Глава8_Наследование;

import java.awt.*;
import java.awt.image.BufferedImage;

public class _247_Table {
}

/*

Object clone() Создает новый объект не отличающийся от клонируемого
===============================================================================================|
| final     |   Object clone()                  | Создает новый объект, не олтличающийся       |
|           |                                   | от клонируемого                              |
|-----------|-----------------------------------|----------------------------------------------|
| final     |   boolean equals(Object object)   | Определяет равен один ли объект другому      |
|-----------|-----------------------------------|----------------------------------------------|
| protected |   void finalize()                 | Вызывается перед удалением неиспользуемого   |
|-----------|-----------------------------------|----------------------------------------------|
| public    |   Class<?> getClass()             | Получает класс объекта во время выполнения   |
| final     |                                   |                                              |
| native    |                                   |                                              |
|-----------|-----------------------------------|----------------------------------------------|
| public    |   int hashCode()                  | Возвращает хеш - код, связанный с вызывающим |
| native    |                                   | объектом                                     |
|-----------|-----------------------------------|----------------------------------------------|
| public    |   void notify()                   | Возобнавляет исполнение потока, ожидающего   |
| final     |                                   | вызываюшего объекта                          |
| native    |                                   |                                              |
|-----------|-----------------------------------|----------------------------------------------|
| public    |   void notifyAll()                | Возобнавляет исполнение всех потоков         |
| final     |                                   | ожидающих вызывающий объект                  |
| native    |                                   |                                              |
|-----------|-----------------------------------|----------------------------------------------|
|           |   String toString()               | Возвращает символьную строку                 |
|           |                                   | описывающую объект                           |
|-----------|-----------------------------------|----------------------------------------------|
|           |   void wait()                     | Ожидает другого потока исполнения            |
|           |   void wait (long миллисекунд)    |                                              |
|           |   void wait (long милисекунд, int |                                              |
|           |   наносекунд)                     |                                              |
===============================================================================================|


*/

class formula{

    String Name;
    Object formula;
    String variableString;

    double[] variable;




    formula(String N,double[] var1){
        this.Name = N;
        this.variable = var1;
    }

    formula(formula s){

    }
}




class Box extends Throwable {
    double width;
    double height;
    double depth;

    //Пример конструктора с избыточным применением ключевого слова this

    //Box(double w,double h, double d){
    //    this.width = w;
    //    this.height = h;
    //    this.depth = d;
    //}

    //Аналогичнй конструктор предыдущему с ключевым словом this
    Box(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width * height * depth;
    }
    public void SysOutPrintln() {
        System.out.println("Объем расчитываемого парралелипипеда равен " + volume());
    }
}

class BoxDemo8 {
    public static void main(String[] args) {
        Box myBox_First = new Box(1,2,3);
        Box myBox_Second = new Box(5,6,7);
        myBox_First.SysOutPrintln();
        myBox_Second.SysOutPrintln();

    }
}



