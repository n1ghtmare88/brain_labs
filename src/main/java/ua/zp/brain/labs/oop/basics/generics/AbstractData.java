package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Администратор on 04.06.2019.
 */
public abstract class AbstractData {
    private long id;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
