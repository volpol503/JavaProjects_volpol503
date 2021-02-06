package OneFolder;

public class Summation {
    int sum(){
        int result = 0;
        System.out.println("Summa vsex chisel:" + result);
        return result;
    }
    int sum(int a){
        int result = a;
        System.out.println("Summa vsex chisel:" + result);
        return result;
    }
    int sum(int a, int b){
        int result = a + b;
        System.out.println("Summa vsex chisel:" + result);
        return result;

    }
    int sum(int a, int b,int c) {
        int result = a + b + c;
        System.out.println("Summa vsex chisel:" + result);
        return result;
    }
    int sum(int a, int b,int c,int d) {
        int result3 = a + b + c + d;
        System.out.println("Summa vsex chisel:" + result3);
        return result3;
    }
}

class SummirovanieTest{
    public static void main(String[] args) {
        Summation s = new Summation();
        s.sum();
        s.sum(1);
        s.sum(1,2);
        s.sum(1,2,3);
        s.sum(1,2,3,4);
    }
}
