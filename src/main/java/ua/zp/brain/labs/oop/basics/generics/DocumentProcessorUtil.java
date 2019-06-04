package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Администратор on 04.06.2019.
 */
public class DocumentProcessorUtil {
    public static int ID_COUNTER=0;

    private DocumentProcessorUtil() {
    }

    public <T extends AbstractData & Storable> StringData convert(T data){
        return  new StringData(ID_COUNTER++,data.getType(),data);
    }

    public static <T> void build(Storable storeObj,T data){
        storeObj.write(data);
    }
}
