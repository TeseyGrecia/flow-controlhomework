package oop;

public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number,String model,double weight){
        this();
       this.number=number;
       this.model=model;
       this.weight=weight;
        System.out.println("zadanie 4");
    }



    public Phone() {
        System.out.println();
    }

    void receiveCall(String name){
        System.out.println("Zvonit" +name);
    }
    void receiveCall(String name, int number){
        System.out.println(("Zvonit" +name) "Nomer" +number);
    }
    int getPhoneNumber(){

        return number;
    }
    void main (int n,String m,double w){
        number=n;
        model=m;
        weight=w;
    }
}
