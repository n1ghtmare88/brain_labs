/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.generics;

public class StringData extends AbstractData {
    private Type type;
    private String data;

    public <T extends AbstractData & Storable>StringData(long id,Type type,T data) {
        super(id);
        this.type=data.getType();
        this.data=data.convertToString();
    }

    @Override
    String convertToString() {
        return data;
    }

    @Override
    public String toString() {
        return "StringData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                '}';
    }
}
