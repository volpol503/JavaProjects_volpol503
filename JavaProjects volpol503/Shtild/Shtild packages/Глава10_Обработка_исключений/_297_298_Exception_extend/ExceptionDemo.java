package Глава10_Обработка_исключений._297_298_Exception_extend;

class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail = a;
    }

    public String toString(){
        return "MyException[" + " detail " + "]";
    }
}



public class ExceptionDemo {

    public static void Demo(){
/* Для JDK2
        BranchGroup objRoot = new BranchGroup();
        Canvas3D C3D = new Canvas3D(null);
        Transform3D rotate = new Transform3D();
        rotate.rotX(Math.PI/4.0d);
        TransformGroup objRotate = new TransformGroup(rotate);
        objRotate.addChild(new ColorCube(0.4));
*/
    }

    static void compute(int a) throws MyException{

        System.out.println("Вызван метод compute ( " + a + " )");
        if(a > 12){
        throw new MyException(a);
        }
        System.out.println("Нормальное знавершение");

    }
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println("Перехвачено исключение: " + e);
        }

    }
}


class ChainDemo{
    static void Demo(){
        //создать исключение
        NullPointerException e = new NullPointerException("верхний уровень");
        //добавить причину исключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            Demo();
        }catch (NullPointerException e){
            //вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);
            //вывести исключение, послуживающее причиной
            //для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());

        }
    }
}
