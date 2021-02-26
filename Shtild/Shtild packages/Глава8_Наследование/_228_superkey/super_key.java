package Глава8_Наследование._228_superkey;




public class super_key {

}

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

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m){
    super(w,h,d);
        weight = m;
    }
}