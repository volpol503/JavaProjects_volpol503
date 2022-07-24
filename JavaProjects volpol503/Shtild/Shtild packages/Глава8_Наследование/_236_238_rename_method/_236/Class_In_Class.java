package Глава8_Наследование._236_238_rename_method._236;

public class Class_In_Class {
}


class A {
    int i,j;
    A(int a, int b){
        i = a;
        j = b;
    }

    //вывести содержимое переменных i и j
    void show(){
        System.out.println("i и j" + i + " " + j);
    }
}

class B extends A{

    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //вывести содержимое переменной k с помощю метода
    //переопределяющего метод show()

    void show(){
        System.out.println("k: " + k);
    }
}


class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show();
        //здесь вызывается метод show() из класса B
        //в выводе которого сокрыты данные a, b
    }
}





