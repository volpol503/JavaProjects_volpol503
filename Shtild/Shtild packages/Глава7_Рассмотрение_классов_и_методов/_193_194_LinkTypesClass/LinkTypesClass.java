package Глава7_Рассмотрение_классов_и_методов._193_194_LinkTypesClass;

public class LinkTypesClass {
}
//Объекты передаются по ссылке на них

class LinkTypes {
    int a, b , c, d;
    LinkTypes(int i, int j){
        a = i;
        b = j;
    }

    //передать объект

    //calc метод вычислений метод meth
    void calc(LinkTypes o){
        o.c *= 2;
        o.d /= 2;

        o.a *= 2;
        o.b /= 2;
    }

}

class PassObjRe {
    public static void main(String[] args) {
        LinkTypes ob = new LinkTypes(15,20);
        System.out.println("до вызова " + ob.a + " " + ob.b);
        ob.calc(ob);
        System.out.println("после вызова " + ob.a + " " + ob.b);
    }
}
