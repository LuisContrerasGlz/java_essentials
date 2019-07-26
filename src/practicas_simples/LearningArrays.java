package practicas_simples;

import java.util.ArrayList;
import java.util.List;

public class LearningArrays {

    public static void main(String[] args) {

        //Array is a continuous representation of same elements in the memory.

        int[] studentMathScore = new int[5];

        for (int i=0; i<5;i++) {

            studentMathScore[i]=i;

        }

        for (int i=0; i<5;i++){

            System.out.println(studentMathScore[i]);
        }

        //Using ArrayList this time

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(35);
        integerList.add(45);
        integerList.add(75);

        System.out.println(integerList.get(3));

        for (int currentInt:integerList) {
            System.out.println(currentInt);
            
        }

        for (int i=0; i <integerList.size();i++){
            System.out.println(integerList.get(i));

        }

        //Remove from the list with index
        integerList.remove(0);
        System.out.println("After removing" + integerList);

    }
}
