package Глава9_Пакеты_и_интерфейсы._261_interface;

public class InterfaceInitialization {
/*
доступ interface имя {
возвращаемый_тип имя_метода1 (список_параметров);
возвращаемый_тип имя_метода2 (список_параметров);

тип имя_конечной_переменной1 (список_параметров);
тип имя_конечной_переменной = значение;

//...
возвращаемый_тип имя метода(список_параметров);
тип имя_конечной_переменной = значение;

}


 */



}

interface Demo {}

interface Callback {
//    в интерфейся релизуется не возвращаемый метод
    void callback(int param);
    void JFrame(double t);
}


class Client implements Callback {
    public void callback(int p){
        System.out.println("Метод callback()" + "вызываемый со значением" + p);
    }

    public void JFrame(double g) {

    }

    void Demo(){
        System.out.println("В классах, реализующие интерфейсы" + "могут определяться другие члены");
    }
}

class TestInterface{
    public static void main(String[] args) {

// Обратите внимание на то что сначала объявления интерфейся передается
// переменной а после присвоения тому классу в которм этот интерфейс реализован
// при том что не создается объект экземпляра класса Сдшуте а его интерфейс
// который содержит один метод callback то есть интерфейс позволяет сократить
// или наоборот приувеличать
        Callback c = new Client();
        c.callback(42);
    }
}

abstract class Incomplete implements Callback{
    int a,b;



    public void callback(int callback){}
    public void JFrame(double S){
        a = (int) S;
    }

    /*

    в этом примере интерфейс Callback не полностью реализован в
    класее Incomplete

    */
    void show(){
        System.out.println(a + b);
    }

}