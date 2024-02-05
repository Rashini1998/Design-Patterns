package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
//        HuwawePhone huwawePhone = new HuwawePhone();
//        huwawePhone.showSpec();
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone myPhone = phoneFactory.getPhone("High Price");
        myPhone.showSpec();

    }
}
