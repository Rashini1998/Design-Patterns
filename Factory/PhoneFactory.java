package Factory;

public class PhoneFactory {
    public Phone getPhone(String type){
        if (type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Middle Price")){
            return new HuwawePhone();
        }else if (type.equalsIgnoreCase("High Price")){
            return new SamsungPhone();
        }
        return null;
    }
}
