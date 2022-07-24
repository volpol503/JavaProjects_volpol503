package Глава7_Рассмотрение_классов_и_методов._192_Box_Object;

public class BoxObject {
}

// В этой версии класса Box один объект допускается
// инициализироввать другим объектом
class BoxOther {
    double width;
    double height;
    double depth;
    // Обратите внимание на этот конструктор. В качестве параметра
    // параметра в нем используются объект типа Box


    BoxOther(BoxOther ob)//Передать объект конструктору
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    BoxOther(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
    BoxOther() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxOther(double lenCube) {
        width = height = depth = lenCube;
    }

    // рассчитать и возвратить объем первого парралелипипеда
    double vol() {
        return width * height * depth;
    }
    void vols() {
        System.out.println(vol());
    }
}


class Overload{
    public static void main(String[] args) {
        BoxOther myBox1 = new BoxOther(10,20,30);
        BoxOther myBox2 = new BoxOther();
        BoxOther myBox3Cube = new BoxOther(8);

        BoxOther copyBox = new BoxOther(myBox1);

//        myBox2 = new BoxOther(myBox3Cube);
//        myBox1.vols();
//        myBox2.vols();
//        copyBox.vols();


        //получить объем первого парралелипипеда
        System.out.println(myBox1.vol());
        //получить объем второго парралелиипипеда
        System.out.println(myBox2.vol());
        //получить объем куба
        System.out.println(myBox3Cube.vol());
        //получить объем копии
        System.out.println(copyBox.vol());

    }
}