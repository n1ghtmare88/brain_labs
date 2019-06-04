package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Администратор on 04.06.2019.
 */
public class NumericData extends AbstractData implements Storable<Number>{
    private final Type type=Type.NUM;
    private Number data;
    public NumericData(long id) {
        super(id);
    }

    @Override
    public Number read() {
        return null;
    }

    @Override
    public void write(Number data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
