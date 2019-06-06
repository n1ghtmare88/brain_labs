package ua.zp.brain.labs.oop.basics.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "4", "5"};
        ArrayList<String> list1 = new ArrayList(Arrays.asList(strings));
        ArrayList<String> list2=new ArrayList(list1);
        ArrayList<String> list3=new ArrayList(Arrays.asList(list2));

    }
}

