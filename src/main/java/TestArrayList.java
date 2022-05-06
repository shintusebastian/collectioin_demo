import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestArrayList {
    public static void main(String[] args) {
        //the data structure that is used to implement the linked list class is a doubly(double-sided/both ends) linked list.
        List<String> test = new ArrayList<>();
        test.add("Shintu");
        test.add("Sebastian");
        test.add("Mercy");
        test.add("Tintu");
        test.add("Ashly");
        test.add("Brijil");
        System.out.println(test.stream().count()); //Stream API is an important feature introduced in Java 8.
        //stream() gives the stream of data(strings).
        //count() gives number of objects the list has.

        }
    }

