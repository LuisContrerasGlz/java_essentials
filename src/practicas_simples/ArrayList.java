package practicas_simples;

import java.util.Iterator;
import java.util.List;

public class ArrayList {


    public static void main(String[] args) {

        List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(5);
        integerList.add(18);
        integerList.add(30);
        integerList.add(12);

        Iterator iterator = integerList.iterator();

        while (iterator.hasNext()){
            System.out.println("Next element is: "+ iterator.next());


        }

        System.out.println(integerList.indexOf(30));
        System.out.println(integerList.contains(12));
        System.out.println(integerList.contains(5));

        int index = integerList.indexOf(18);
        integerList.remove(index);


    }
}
