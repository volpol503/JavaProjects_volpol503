package Глава8_Наследование._228_superkey;

import javax.swing.Box;

public class classBoxWeight {

}

class Box_private {
    private double width;
    private double height;
    private double depth;
    //конструктор применяемй при копии объекта
    Box_private(Box_private ob){
        width = ob.width; height = ob.height; depth = ob.depth;
    }
    //конструктор для указания ввсех размеров
    Box_private(double width, double height, double depth){
        width = width; height = height; depth = depth;
    }

    //конструктор применяемый в отсутствие размеров
    Box_private() {  width = -1; height = -1; depth = -1; }

    //конструктор применяемй при создании куба
    Box_private(double len) { width = height = depth; }

    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }

}

class Box_Weight extends Box_private{
    double weight;//вес парралелипипеда

    //сконструировать клон объекта
    Box_Weight(Box_Weight ob){
        //Передать объект конструктору
        super(ob); weight = ob.weight;
    }

    Box_Weight(double w, double h, double d, double m){
        super(w,h,d); weight = m;
    }

    Box_Weight(double length, double m){
        super(length); weight = m;
    }
    Box_Weight(){ super(); weight = 1; }
}

class DemoSuper {
    public static void main(String[] args) {
    Box_Weight Box1 = new Box_Weight(11,20,15,34.3);
    Box_Weight Box2 = new Box_Weight(2,3,4,5);
    Box_Weight Box3 = new Box_Weight();
    Box_Weight BoxCube = new Box_Weight(1,2);
    //копия конструктора Box1
    Box_Weight Box5 = new Box_Weight(Box1);
    double vol;
    vol = Box1.volume();
    System.out.println("Объем Box1 равен " + vol + "\n");
    System.out.println("Вес Box1 равен " + Box1.weight);
        vol = Box2.volume();
        System.out.println("Объем Box2 равен " + vol + "\n");
        System.out.println("Вес Box2 равен " + Box3.weight);

        vol = Box3.volume();
        System.out.println("Объем Box3 равен " + vol + "\n");
        System.out.println(" Объем Box3 равен " + Box3.weight);

        vol = BoxCube.volume();
        System.out.println("Объем Box2 равен " + vol + "\n");
        System.out.println(" Объем BoxCube равен " + BoxCube.weight);

        vol = Box5.volume();
        System.out.println("Объем Box5 равен " + vol);
        System.out.println("Вес Box5 равен " + Box5.weight);
    }
}








