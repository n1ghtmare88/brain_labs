/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.generics;

public class XmlData extends AbstractData implements Storable<String> {
    private final Type type=Type.XML;
    private String data;


    public XmlData(long id) {
        super(id);
    }


    @Override
    public String read() {
        return data;
    }

    @Override
    public void write(String data) {
        this.data=data;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    String convertToString() {
        return data;
    }

    @Override
    public String toString() {
        return "XmlData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                '}';
    }
}
