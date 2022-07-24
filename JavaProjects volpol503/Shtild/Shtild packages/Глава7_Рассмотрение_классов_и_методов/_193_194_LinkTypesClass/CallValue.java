package Глава7_Рассмотрение_классов_и_методов._193_194_LinkTypesClass;

public class CallValue {
}



//Подробное рассмотрение особенностей передачи аргументов
class Test {
    Test(){}
    int i, j;
    int calcI(){i *= 2; return i;}
    int calcJ(){j /= 2; return j;}

    Test(int t1,int t2, int t3){
        i = t1; j = t2; t3 = 0;
    }
    void meth(double I,double J){
        I = calcI();
        J = calcJ();
    }
}

class CallByValue{
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a и b до вызова " + a + " " + b);


        //Усовершенствование кода для выполнения присвоения переменных a и b
        ob.i = a = 15;
        ob.j = b = 20;

        //ob.calcI(); ob.calcJ();

        //двойной вызов метода calcI и calcJ
        //ob.calcI(); ob.calcJ();
        //ob.meth(ob.calcI(), ob.calcJ());

        // Никакого влияния класс Test с методом meth на вызов его в классе CallByValue
        // не производит с переменнами int a, b из за того что переменная в случае выполнения
        // должна передаваться по ссылке
        ob.meth(a,b);

        System.out.println("a и b до после " + a + " " + b);


    }
}


