package OneFolder.Overloading.Pr_2;

public class MethodOverloading2 {

    int sum(int i1, int i2){
        return i1 + i2;
    }
    String sum (String s1, String s2){
        return s1 + s2;
    }

}
class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mo2 = new MethodOverloading2();

        int a = mo2.sum(1,2);
        System.out.println(a);
        String s = mo2.sum("privet","friend");
        System.out.println(s);
    }
}
