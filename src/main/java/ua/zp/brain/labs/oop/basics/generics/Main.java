package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Администратор on 04.06.2019.
 */
public class Main {
    public static void main(String[] args) {
        XmlData xmlData=new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData numericData=new NumericData(DocumentProcessorUtil.ID_COUNTER++);
        BinaryData binaryData=new BinaryData(DocumentProcessorUtil.ID_COUNTER++);

        String uml="<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        Number number=123.0;

    }
}
