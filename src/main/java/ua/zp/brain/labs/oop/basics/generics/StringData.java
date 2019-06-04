package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Администратор on 04.06.2019.
 */
public class StringData extends AbstractData {
    private Type type;
    private String data;

    public <T extends AbstractData & Storable>StringData(long id,Type type,T data) {
        super(id);
        this.type=type;
        this.data=data.toString();
    }
}
