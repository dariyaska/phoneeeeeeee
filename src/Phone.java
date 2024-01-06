public class Phone {
    public int number;
    public String model;
    public double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;    }
    public Phone(int number, String model) {
        this(number, model, 0.0);    }
    public Phone() {
        this(0, "ноунейм", 0.0);}//это конструктуры с вызывом другого нипон крч нужно
    public static void main(String[] args) {
    }//нужно чтобы связать  main void  и с классом
    public void info() {
        System.out.println("номер:" + number);
        System.out.println("модель:" + model);
        System.out.println("вес:" + weight);
    } // принт информэйшн эбаут тилипон>:(
    public void receiveCall(String name) {
        System.out.println(name + " звонит");}
    public void receiveCall(String name, int callerNum) {
        System.out.println(name + " звонит" + callerNum);
    }  // для метода принятия звонка и чтобы принт номер звонящего
    public void sendMessage( String... phoneNumbers){
        System.out.print("отправка мессаджа на номер :");
        for(String number : phoneNumbers){
            System.out.print(number+ " ");}
        System.out.println();    }
    public int getNumber(){
        return number;}
    public void setNumber(int number){
        this.number=number;}
    public String getModel() {
        return model;}
    public void setModel(String model) {
        this.model = model;    }
    public double getWeight(){
        return weight;}
    public void setWeight(double weight) {
        this.weight = weight;    }
    // для полученя и установки веса типона
}
