package oca.main;

public class WeekOne {
    static TestStatic nurullah = new TestStatic();

    public static void main(String[] args) {
        System.out.println("Hello World");
        nurullah.speed();
        System.out.println("myFirstVariable from TestStatic " + nurullah.myFirstVariable);
        TestStatic.speed();

        System.out.println(args.length > 0 ? "The first element of args Array is " + args[0] : "Args array is null");
    }
}

class TestStatic {

    int myFirstVariable;


    public static void speed(){
        System.out.println("from TestStatic class");
    }
}

