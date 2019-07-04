/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.input_output;

import java.io.*;

public class FilePrinter {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Brainacad4\\IdeaProjects\\brain_labs\\src\\main\\java\\ua\\zp\\brain\\labs\\oop\\basics\\statics\\Test.java");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int tmp;
            while ((tmp = bufferedReader.read()) != -1) {
                System.out.print((char) tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
