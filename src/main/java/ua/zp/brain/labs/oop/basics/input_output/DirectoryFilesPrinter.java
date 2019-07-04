/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.input_output;

import java.io.File;

public class DirectoryFilesPrinter {

    public static void main(String[] args) {
        File file=new File("C:\\Users\\Brainacad4\\IdeaProjects\\brain_labs");
        printNames(file.listFiles());
    }

    public static void printNames(File []files) {
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getAbsolutePath());
                if (file.isDirectory()) {
                    printNames(file.listFiles());
                }
            }

        }
        else {
            System.out.println("empty");
        }
    }

}
