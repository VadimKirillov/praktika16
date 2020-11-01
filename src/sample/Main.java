package sample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){

        List <Integer> list = new ArrayList<Integer>();


        for (int i=0;i<=10;i++)
            list.add(i);


        for (Integer list1 : list)
            System.out.println(list1);


        list.remove(7);
        list.remove(2);
        list.remove(5);

        System.out.println();
        System.out.println();

        for (Integer list1 : list)
            System.out.println(list1);

    }
}
