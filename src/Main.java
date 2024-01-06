
public class Main {
    public static void main(String[] args)  {
        Phone myPhone = new Phone(123456789, "iPhone -X", 0.5);
        Phone ainurPhone= new Phone(858585852, "Iphone XX", 0.66);
        Phone nonamePhone= new Phone();

        System.out.println("инфа о моем типоне :");
        myPhone.info();
        System.out.println("------");
        System.out.println("инфа о  типоне Айнурочки :");
        ainurPhone.info();
        System.out.println("------");
        System.out.println("инфа о типоне нн-ма:");
        nonamePhone.info();
        System.out.println("------");        //  инфа о экземпляраа

        myPhone.receiveCall("дарияшка");
        System.out.println("мой номер типона :"+ myPhone.getNumber());
        myPhone.receiveCall("айнурбечкин");
        System.out.println("номер типона айнурбечки:"+ ainurPhone.getNumber());
        myPhone.receiveCall("дарияшка");
        System.out.println("ноунейма номер :"+ nonamePhone.getNumber());
        myPhone.sendMessage("");
        ainurPhone.sendMessage("" );
        myPhone.setNumber(987654321);
        myPhone.setModel("Samsung Galaxy S21");
        myPhone.setWeight(0.6);
        System.out.println("------");
        System.out.println("Обновленная информация о телефоне Дарии:");
        myPhone.info();
    }
}
