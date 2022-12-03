package creational.construct.extension;

public class Client {

    public static void main(String[] args) {
        Phone myPhone = new Phone.Builder()
                .name("IPHONE").cpu("枭龙").screen("SAMSUNG").mainBoard("华硕主板").build();
        System.out.println(myPhone.toString());
    }
}
