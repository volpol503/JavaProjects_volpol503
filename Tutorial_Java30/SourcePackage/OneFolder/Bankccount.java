package OneFolder;

public class Bankccount {
    int id = 10;
    String name = "Alex";
    double balance = 100;
    void popolnenieSheta(double summaPopolneniya){
        System.out.println("Balans do popolnenya: " + balance);
        System.out.println("Balans popolnenya na " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balans posle popolnenya " + balance);
        System.out.println("");
    }
    void snyarieSoSheta(double summaSnyatiya){
        System.out.println("Balans do snyatia " + balance);
        System.out.println("Balance umenshaetsya na: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans  posle snyatia " + balance);
        System.out.println("");
    }
}
class BankAccountTest{
    public static void main(String[] args) {
    Bankccount MyAccount = new Bankccount();
    MyAccount.popolnenieSheta(30.5);
    MyAccount.snyarieSoSheta(20.5);
    }
}