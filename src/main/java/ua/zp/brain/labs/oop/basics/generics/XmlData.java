package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Администратор on 04.06.2019.
 */
public class XmlData extends AbstractData implements Storable<String> {
    private final Type type=Type.XML;
    private String data;


    public XmlData(long id) {
        super(id);
    }


    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
