package Inheritance;

public class Main {

    public static void main(String[] args) {
        Parent p = new Parent();
        String s = p.testM1();
        System.out.println(s);

        System.out.println("--------------------------------");

        Parent p1 = new Child();
        String s1 = p1.testM1();
        System.out.println(s1);

        System.out.println("--------------------------------");

        Child c1 = new Child();
        String c2 = c1.testM1();
        System.out.println(c2);

    }

}
