package Глава8_Наследование._236_238_rename_method._238;

public class Override {}

//Методы с отличающимися сигнатурами считаются
//перегруженными а не определенными

class A{
    int i,j;
    A(int a, int b){
        i = a;
        j = b;
    }
    //вывести содержимое переменных i и j
    void show(){
        System.out.println("i и j:  " + i + " " + j );
    }
}

//создать подкласс путем расширения класса А
class B extends A{
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    //перегрузить метод super()
    void show(String msg){
        System.out.println(msg + k);
    }
}

class OverrideRun{
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show("Это k: ");
        subOb.show(); //вызвать метод show() из класса A
    }

}