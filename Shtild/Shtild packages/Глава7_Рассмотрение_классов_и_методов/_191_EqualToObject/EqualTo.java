package Глава7_Рассмотрение_классов_и_методов._191_EqualToObject;

public class EqualTo {
}

//Объекты допускается передавать методам
//в качестве параметров

class Test{
    int a,b;
    Test(int i, int j){a = i;b = j;}
    //возвратить логическое значение true, если в качестве
    //параметра о указан ввызывающий объект

    //boolean equalTo(Test object) {
    //    if (object.a == a && object.b == b)
    //        return true;
    //    else return false;
    //}



    //возвратить логическое значение true, если в качестве
    //параметра о указан ввызывающий объект

    // В параметре Test o вызывается класс типа Object для которого
    // все типы данных являются его производными
    boolean equalTo(Test o) {if(o.a == a && o.b == b)
        return true;
    else return false;
    }

    void SysOutPrintln(){System.out.println();}
}
class PassOb{
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-11,-11);
        Test ob4 = new Test(13,13);
        Test ob5 = new Test(13,13);
        Test ob6 = new Test(13,13);
        //вот здесь когда идет вызов метод объекта с параметром
        //от метода класса boolean object возврат значения
        //также boolean type

        // в книге произведена опечатка однако в этом примере логика
        //booleаn = true в случае если вызываемый объект равен вызываемому
        System.out.println(ob1.equals(ob2));//false
        System.out.println(ob1.equals(ob3)  + "\n");//false

        System.out.println(ob1.equals(ob1));//true
        System.out.println(ob2.equals(ob2));//true
        System.out.println(ob3.equals(ob3) + "\n");//true


        //в книге неправильно написан вывод метода на самом деле ob<>.equalTo(<>)
        //то есть метод equalTo() из класса Test а не метод equal()
        System.out.println(ob1.equalTo(ob2));//true (100, 22) == (100, 22)
        System.out.println(ob1.equalTo(ob3));//false (100,22) == (-11; -11)
        System.out.println(ob1.equalTo(ob1));//true (100, 22) == (100, 22)
        System.out.println(ob5.equalTo(ob4));//true (13, 13) == (13, 13)
        System.out.println(ob5.equalTo(ob6));//true (13, 13) == (13, 13)
        System.out.println(ob5.equalTo(ob3));//false (13, 13) == (-11, 11)

    }
}