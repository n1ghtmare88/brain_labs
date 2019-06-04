package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Администратор on 04.06.2019.
 */
public class BinaryData extends AbstractData implements Storable<Byte>{
    private final Type type=Type.BIN;
    private Byte[] data;

    public BinaryData(long id) {
        super(id);
    }

    @Override
    public Byte read() {
        return null;
    }

    @Override
    public void write(Byte data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
