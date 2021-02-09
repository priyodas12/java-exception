package io.javalab;

public class ExceptionStack {

    private static void doThis(){
        System.out.println("do This");
        doThat();
    }

    private static void doThat() {
        System.out.println("do That");
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        doThis();
    }
}
