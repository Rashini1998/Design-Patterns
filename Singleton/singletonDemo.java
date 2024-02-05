package Singleton;

public class singletonDemo {
    public static void main(String[] args) {
        //singleton obj = new singleton(); --> error

        singleton obj = singleton.getInstance();
        obj.showData();
    }
}
