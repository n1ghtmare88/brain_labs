package ua.zp.brain.labs.oop.basics.strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = new String("World");
        char[] chars = {'B', 'R', 'A', 'I', 'N'};
        String strChar = new String(chars);
        String strBytes = new String(string1.getBytes());
        StringBuilder stringBuilder = new StringBuilder("Hello");

        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] array = fruits.split(",");
        int maxLength = array[0].length();
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength) {
                resultIndex = i;
                maxLength = array[i].length();
            }
        }


        System.out.println(array[resultIndex].toLowerCase());
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0, 3).toLowerCase();

        }

        String str = " Я_новая_строка ";
        str = str.trim().replace('_', ' ');
        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Вы ввели:");
        String result = scanner.nextLine();
        if (result.startsWith("Запуск")) System.out.println("\"Запускаем процесс\"");
        if (result.endsWith("завершен")) System.out.println("\"Процесс завершен\"");
        if (result.toLowerCase().contains("ошибка")) System.out.println("\"Произошла ошибка\"");

        StringBuilder builder = new StringBuilder(0);
        builder.append(string1)
                .append(string2)
                .append(strChar)
                .append("\n")
                .append(strBytes)
                .append(stringBuilder)
                .append(fruits)
                .append("\n")
                .append(str)
                .append(result)
                .reverse();
        System.out.println(builder);

    }
}
