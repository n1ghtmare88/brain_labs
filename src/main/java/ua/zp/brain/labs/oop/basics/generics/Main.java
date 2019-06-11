/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.generics;

public class Main {
    public static void main(String[] args) {
        XmlData xmlData=new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData numericData=new NumericData(DocumentProcessorUtil.ID_COUNTER++);
        BinaryData binaryData=new BinaryData(DocumentProcessorUtil.ID_COUNTER++);

        String str="Данные в байтах";
        String uml="<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        Double number=123.0;
        byte[] bytes=str.getBytes();

        DocumentProcessorUtil.build(xmlData,uml);
        DocumentProcessorUtil.build(numericData,number);
        DocumentProcessorUtil.build(binaryData,bytes);

        System.out.println(xmlData);
        System.out.println(binaryData);
        System.out.println(numericData);

        StringData dataXml=DocumentProcessorUtil.convert(xmlData);
        StringData dataBinary=DocumentProcessorUtil.convert(binaryData);
        StringData dataNumeric=DocumentProcessorUtil.convert(numericData);

        System.out.println(dataXml);
        System.out.println(dataBinary);
        System.out.println(dataNumeric);

    }
}
