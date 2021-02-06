package Глава6_Введение_в_классы.BoxClassPackages.BoxDemo1;

class Box{
    double width;
    double height;
    double depth;
    double vol;
}


class BoxDemo1 {
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