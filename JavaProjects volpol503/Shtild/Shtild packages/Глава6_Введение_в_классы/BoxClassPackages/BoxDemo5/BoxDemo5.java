package Глава6_Введение_в_классы.BoxClassPackages.BoxDemo5;

class Box{
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

class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox1.setDim(1,2,2);
        myBox2.setDim(3,6,9);
        vol = myBox1.volume();
        System.out.println("Объем первого парралелипипеда" + vol);
        vol = myBox2.volume();
        System.out.println("Объем второго параллелипипеда" + vol);
    }
}