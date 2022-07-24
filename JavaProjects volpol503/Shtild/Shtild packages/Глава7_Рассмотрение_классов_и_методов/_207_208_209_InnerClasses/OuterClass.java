package Глава7_Рассмотрение_классов_и_методов._207_208_209_InnerClasses;

public class OuterClass {
}

class _207_Outer {
    int outer_x = 100;
    void test(){
        Inner in = new Inner();
        in.display();
    }

    class Inner{
        void display(){
            System.out.println("вывод" + outer_x);
        }
    }
}

class _207_InnerClassDemo{
    public static void main(String[] args){
        _207_Outer outer = new _207_Outer();
        outer.test();
    }
}

class _208_Outer {
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        int y = 12; //y - локальная переменная класса Inner
        void  display(){
            System.out.println("вывод " + outer_x);
        }

    }

//    void show(){
//        System.out.println(y);
//    }
}

class _208_InnerClassDemo {
    public static void main(String[] args) {
        _208_Outer outer = new _208_Outer();
        outer.test();
    }
}

//Определить внутренний класс в цикле for

class _209_Outer {
    int outer_x = 100;

    void test(){
        for (int i = 0; i < 12; i++){
            class Inner {
                void display(){
                    System.out.println("вывод " +  outer_x );
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

class _209_InnerClassDemo {
    public static void main(String[] args) {
        _209_Outer outer = new _209_Outer();
        outer.test();
    }
}