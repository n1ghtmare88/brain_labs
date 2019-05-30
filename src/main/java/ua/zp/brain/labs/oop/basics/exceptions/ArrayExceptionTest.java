package ua.zp.brain.labs.oop.basics.exceptions;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        printArray(array,0,4);
        printArray(array,0,5);
    }
    public static void printArray(int[]ar,int start,int end){
        try {
            for (int i = start; i <=end ; i++) {
                start=i;
                System.out.println("array["+i+"]="+ar[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка. Попытка обращения к\n" +
                    "несуществующему индексу: текущий индекс ="+start+" ; размер массива = "+ar.length);
        }
    }
}
