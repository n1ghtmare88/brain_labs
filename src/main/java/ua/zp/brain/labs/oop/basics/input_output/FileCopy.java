/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Brainacad4\\test_copy.txt");
             FileInputStream inputStream=new FileInputStream("C:\\Users\\Brainacad4\\test.txt");)
        {
            int tmp;
                while ((tmp=inputStream.read())!=-1){
                    outputStream.write(tmp);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
