/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.generics;

public class NumericData extends AbstractData implements Storable<Number>{
    private final Type type=Type.NUM;
    private Number data;
    public NumericData(long id) {
        super(id);
    }

    @Override
    public Number read() {
        return data;
    }

    @Override
    public void write(Number data) {
        this.data=data;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    String convertToString() {
        return String.valueOf(data);
    }

    @Override
    public String toString() {
        return "NumericData{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }
}
