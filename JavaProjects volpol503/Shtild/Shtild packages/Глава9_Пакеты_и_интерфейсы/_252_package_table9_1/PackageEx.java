package Глава9_Пакеты_и_интерфейсы._252_package_table9_1;

public class PackageEx {
}

class Balance{
    String name;
    double bal;
    Balance(String n, double b){
        name = n;
        bal = b;
    }

    void show(){
        if(bal < 0){
            System.out.print("--->");
            System.out.println(name + ": $" + bal);
        }
    }
}

class AccountBalance{
    public static void main(String[] args) {
        int id = 3;
        Balance current[] = new Balance[3];

        current[0] = new Balance("Al", 123);
        current[1] = new Balance("Bl", 152);
        current[2] = new Balance("Tw ", -12);

        for(int i = 0;i < 3; i++ ) current[i].show();
    }
}


