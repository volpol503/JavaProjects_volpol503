package OneFolder;

public class Test20 {
    Test20(){}

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    int SredneeArifmeticheskoe(int a1, int b1, int c1){
        int result = summa(a1, b1, c1)/3;
        return result;
    }
}

class Test21{
    public static void main(String[] args){
        Test20 t = new Test20();
        int summaTrexChisel = t.summa(1,2,3);
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(5,10,15));
        System.out.println(t.SredneeArifmeticheskoe(1,2,3));
    }
}

