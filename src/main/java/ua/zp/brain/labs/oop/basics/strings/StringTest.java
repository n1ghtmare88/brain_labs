package ua.zp.brain.labs.oop.basics.strings;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String string1="Hello";
        String string2=new String("World");
        char[]chars={'B','R','A','I','N'};
        String strChar=new String(chars);
        String strBytes=new String(string1.getBytes());
        StringBuilder stringBuilder=new StringBuilder("Hello");

        String fruits="Апельсин,Яблоко,Гранат,Груша".toLowerCase();

        String[]array=fruits.split(",");
        System.out.println(Arrays.toString(array));

    }
}
