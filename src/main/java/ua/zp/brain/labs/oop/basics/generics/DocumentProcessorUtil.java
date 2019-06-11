/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.generics;

public class DocumentProcessorUtil {
    public static int ID_COUNTER=0;

    private DocumentProcessorUtil() {
    }

    public static <T extends AbstractData & Storable> StringData convert(T data){
        return  new StringData(ID_COUNTER++,data.getType(),data);
    }

    public static <T> void build(Storable storeObj,T data){
        storeObj.write(data);
    }
}
