package ua.zp.brain.labs.oop.basics.exceptions;

public class StackOverFlowTest {
    public static int count;
    private StackOverFlowTest() {
    }
    public static void test(){
        System.out.println("count = "+count++);
        test();
    }
}
