package Глава8_Наследование._224_extends_Box;

public class ClassBox {
}

// В этой программе наследование применяется
// для расширения класса Box
class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор применяемй при указании всех размеров
    Box(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //конструктор применяемй в отсутствие размеров
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
}


class BoxWeight extends Box{
    //инициализировать вес парралелипипеда
    double weight;

    //конструктор BoxWeight
    BoxWeight(double w,double h, double d, double mass){
        width = w;
        height = h;
        depth = d;
        weight = mass;
    }
}

class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight myBoxFirst = new BoxWeight(11,20,15,34.3);
        BoxWeight myBoxSecond = new BoxWeight(2,3,4,0.076);
        double vol; vol = myBoxFirst.volume();
        System.out.println("Объем meBox1 равен " + vol);
        System.out.println("Вес myBox1" + myBoxFirst.weight);
        vol = myBoxSecond.volume();
        System.out.println("Объем meBox2 равен " + vol);
        System.out.println("Вес myBoxSecond" + myBoxSecond.weight);
    }
}

class ColorBox extends Box{
    int color;

    ColorBox(double w, double h, double d, int c){
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}





