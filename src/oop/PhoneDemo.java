package oop;

/**
 * Created by Student on 04.10.2017.
 */
public class PhoneDemo {
    public static void main(String args[]){
        Phone b1= new Phone(120,"meizu",56);
        Phone b2= new Phone();
        Phone b3= new Phone();
        Phone b4= new Phone();

        b1.number= 100;
        b1.model = "nokia";
        b1.weight= 15;
        b2.number =120;
        b2.model = "samsung";
        b2.weight = 30;
        b3.number = 154;
        b3.model = "xiaomi";
        b3.weight = 78;
        b1.receiveCall("mama");
        b1.getPhoneNumber();
        b4.receiveCall("amina",454);

        System.out.println(" "+b1.weight);
        System.out.println(" "+b2.model);
        System.out.println(" "+b3.number);
        System.out.println(" "+b1.getPhoneNumber());
        System.out.println(b4.receiveCall());
    }
}
