package hello.coreex.member;

public class hw {

    B b = new B();


    public void print() {

        System.out.println();
    }

    public static void main(String[] args) {
        hw hw1 = new hw();

        hw1.print();
    }
}


class B {
    public static String name = "홍길동";

    public static String getName() {
        return name;
    }



}