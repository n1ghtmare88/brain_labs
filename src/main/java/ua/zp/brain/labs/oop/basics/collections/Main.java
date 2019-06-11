package ua.zp.brain.labs.oop.basics.collections;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] strings = {"0","1", "2", "3", "4"};
        List<String> list1 = new ArrayList(Arrays.asList(strings));
        List<String> list2=new ArrayList(list1);
        List<String> list3=Arrays.asList("5","6","7","8","9");
        list2.addAll(list2.size()/2,list3);

        Collections.sort(list2);

        Iterator<String> iterator=list2.listIterator();
        for (int i = 0; iterator.hasNext() ;i++) {
            iterator.next();
            if(i%2!=0){
                iterator.remove();
            }

        }


        Set<String> set1=new HashSet<>();
        set1.add("aaa");
        set1.add("bbb");
        set1.add("ccc");
        set1.addAll(list1);
        set1.addAll(list2);

        Set<String> set2=new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);

        Map<Integer,String> map1=new HashMap<>();
        Integer[] numbers={1,2,3,4,5,6,7,8,9,10,11,12};
        String[] mounts={"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        for (int i = 0; i <12 ; i++) {
            map1.put(numbers[i],mounts[i]);
            System.out.println(map1.get(i));
        }

    }
}

