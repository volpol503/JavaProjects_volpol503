package Глава7_Рассмотрение_классов_и_методов._189_BoxOverload;

public class BoxOverload {
}
class Box{ double width;double height;double depth;

    //конструктор когда указываются все размеры
    Box(double w, double h, double d){width = w;height = h;depth = d;}

    //конструктор, используемый когда ни один параметр не указан
    Box(){ width = -1;height = -1;depth = -1;}

    //конструктор используемый при создании куба
    Box(double len){
        width = height = depth = len;
    }

    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
    void SyOutPrintln(){
        System.out.println(volume());
    }
}

class OverloadBox{
    public static void main(String[] args) {
        Box mybox1 = new Box(20,30,45);
        Box myBox2 = new Box();
        Box cube = new Box(5);

        //получить объем первого парралелипипеда
        mybox1.SyOutPrintln();
        //получить объем второго парралелипипеда
        //значения не инициализированного параллелипипеда
        myBox2.SyOutPrintln();
        //получить объем куба
        cube.SyOutPrintln();
    }
}
