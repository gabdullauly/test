public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight){
        this.number = number;
        this.model  = model;
        this.weight = weight;
    }
    public Phone(){

    }

    String getData(){
        return number+" "+model+" "+weight;
    }

    void receiveCall(String a){
        System.out.print("Звонит "+a);
    }


}
