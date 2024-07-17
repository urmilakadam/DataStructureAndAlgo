package Inheritance;

public class Parent {

    public String testM1(){
        System.out.println("Inside parent method m1");
        String s = testM2();
        return s;

    }

    public String testM2(){
        System.out.println("Inside parent method m2");
        return "return form parent class M2";
    }
}
