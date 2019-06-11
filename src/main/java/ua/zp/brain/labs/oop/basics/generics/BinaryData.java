/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.generics;

import java.util.Arrays;

public class BinaryData extends AbstractData implements Storable<byte[]>{
    private final Type type=Type.BIN;
    private byte[] data;

    public BinaryData(long id) {
        super(id);
    }

    @Override
    public byte[] read() {
        return data;
    }

    @Override
    public void write(byte[] data) {
        this.data=data;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    String convertToString() {
        return new String(data);
    }

    @Override
    public String toString() {
        return "BinaryData{" +
                "type=" + type +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
