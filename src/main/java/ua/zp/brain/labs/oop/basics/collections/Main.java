package ua.zp.brain.labs.oop.basics.collections;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] strings = {"0","1", "2", "3", "4"};
        List<String> list1 = new ArrayList(Arrays.asList(strings));
        List<String> list2=new ArrayList(list1);
        List<String> list3=Arrays.asList("5","6","7","8","9");

        System.out.println("list before insert another list "+list2);

        list2.addAll(list2.size()/2,list3);
        System.out.println("list after insert another list "+list2);

        Collections.sort(list2);
        System.out.println("list sorted "+list2);

        Iterator<String> iterator=list2.listIterator();
        for (int i = 0; iterator.hasNext() ;i++) {
            iterator.next();
            if(i%2!=0){
                iterator.remove();
            }
        }
        System.out.println("list after deleting items "+list2+"\n");


        Set<String> set1=new HashSet<>();
        set1.add("aaa");
        set1.add("bbb");

        System.out.println("set"+set1);
        System.out.println("list1 "+list1);
        System.out.println("list2 "+list2);
        System.out.println("list3 "+list3);

        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println("set after insert list1 and list2"+set1);


        Set<String> set2=new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println("setLinked after insert list2 and list3"+set2+"\n");


        Map<Integer,String> map1=new HashMap<>();
        Integer[] numbers={0,1,2,3,4,5,6,7,8,9,10,11};
        String[] mounts={"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        for (int i = 0; i <12 ; i++) {
            map1.put(numbers[i],mounts[i]);
        }
        System.out.println("map"+map1);
        System.out.println("first mounts = "+map1.get(0));
        System.out.println("last mounts = "+map1.get(11));
        map1.put(6,"ОТПУСК");
        System.out.println("map"+map1);



        Set<User> userSet=new HashSet<>();
        User user=new User("Dmitriy",3,"066-111-22-33");
        userSet.add(new User("Dmitriy",31,"066-111-22-33"));
        userSet.add(new User("Elena",30,"066-444-55-66"));

        userSet.add(user);
        System.out.println(userSet);

        user.setAge(31);
        System.out.println(userSet);


    }

}

