package OneFolder;


interface Callback {
    void callback(int param);
}

class Client implements  Callback{
    public void callback(int i){}
    public void call(int p){
    //реализовать интерфейс Callback
        System.out.println("Метод callback(),"+"вызываемый со значением" + p);
    }
}

class Testlface {
    public static void main(String args[]) {
            Callback с = new Client();
            ((Client) с).call(42);
        }
}


