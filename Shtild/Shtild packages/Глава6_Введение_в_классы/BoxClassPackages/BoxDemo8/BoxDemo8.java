package Глава6_Введение_в_классы.BoxClassPackages.BoxDemo8;



class Box{
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

public class BoxDemo8 {
    public static void main(String[] args) {
        Box myBox_First = new Box(1,2,3);
        Box myBox_Second = new Box(5,6,7);
        myBox_First.SysOutPrintln();
        myBox_Second.SysOutPrintln();
    }
}

