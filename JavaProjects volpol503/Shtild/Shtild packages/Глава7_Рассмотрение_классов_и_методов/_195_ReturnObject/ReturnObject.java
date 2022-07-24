package Глава7_Рассмотрение_классов_и_методов._195_ReturnObject;

public class ReturnObject {

}



//Возврат объектов

class Test{
    int a;
    Test(int i){
        a = i;
    }

    //Метод типа Object с названием класса то есть конструктора

    Test eight(){ Test t = new Test(a+ 8);return  t;}

    Test eleven() {
        Test temp = new Test(a + 11);


        return temp;
//        return null;
    }
}

class RetOb{
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1 .eleven();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
        ob2 = ob2 .eleven();
        System.out.println(ob2.a);
    }
}


//Управление досупом

