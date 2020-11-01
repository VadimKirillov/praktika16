package sample;
import java.util.LinkedList;

public class LnkedList{
    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<>();

        strings.add("String 1");
        strings.add("String 2");
        strings.add("String 3");

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println();

        System.out.println(strings.get(2));

        strings.remove(1);

        System.out.println();
        System.out.println();

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
