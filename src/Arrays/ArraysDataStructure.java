package Arrays;

import java.util.Arrays;

public class ArraysDataStructure {

    public static void main(String[] args) {

        String [] fruits = new String[5];

        fruits[0] = "Pawpaw";
        fruits[1] = "Orange";
        fruits[2] = "Tangerine";
        fruits[3] = "Banana";


        System.out.println(Arrays.toString(fruits));


        fruits[4] = "Apple";

        System.out.println(Arrays.toString(fruits));

        for (int i = fruits.length - 1; i >=0 ; i--) {
            System.out.println(fruits[i]);
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Arrays.stream(fruits).forEach(System.out::println);

    }
}
