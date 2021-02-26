package Глава8_Наследование._223_extends_exp;

public class Extends {
}

class A {
    int i;
    private int j;

//    int set_j(int e){
//        j = e;
//        return e;
//    }

    void set_ij(int x, int y){
        i = x;
        j = y;
    }
}

class B extends A{
    int total;

    void sum(){
        total = i; // Ошибка: член j в этом классе недоступен
    }

}
class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.set_ij(11,12);
        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}



