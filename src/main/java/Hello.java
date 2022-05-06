import java.util.*;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        Iterable collection=new ArrayList();
        //      Iterator iterator = collection.iterator();//this iterator method will iterate through the given collection.
        Collection<String> collection = new ArrayList<>();
        collection.add("Shintu");
        collection.add("Neethu");
        collection.add("Adeline");
        for (String s : collection) {
//            s.toUpperCase(Locale.ROOT);
            System.out.println(s.toUpperCase(Locale.ROOT));
        }
//        System.out.println(collection);
        //also we can print the elements using the iterator also
        Iterator<String> iterator = collection.iterator();
while(iterator.hasNext()){
    System.out.println(iterator.next());
}
ArrayList test=new ArrayList<>();
        LinkedList test2=new LinkedList<>();

    }
}
