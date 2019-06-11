/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.generics;

public interface Storable<S> {
    S read();
    void write(S data);
    Type getType();
}
