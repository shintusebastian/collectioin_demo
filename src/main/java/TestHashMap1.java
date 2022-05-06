import java.util.*;

public class TestHashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> test = new HashMap<>(5);
        test.put(1, "Canada");
        test.put(2, "USA");
        test.put(3, "India");
        test.put(4, "Pakistan");
        System.out.println(test.getOrDefault(4, "not found"));//Returns the value to which the specified key is
        // mapped or defaultValue if this map contains no mapping for the key.

//Compute method is given below
        System.out.println(test.compute(2, (k, v) -> k + v));//This will take the key2, and concatenate the value with that key and map it to the value in
        // key 2.
        //or
        System.out.println(test.compute(2, (k, v) ->  v.toUpperCase(Locale.ROOT)));//we can just consume the value only
        // and not the key. But, we have to give a lambda that acts as a bi function and we can choose what is the
        //new implementation that we want to give.

        System.out.println(test.values());// this gives the collection of all values.
        System.out.println(test.keySet());// this gives the collection of all keys.
        Set<Integer> keySet = test.keySet();// this is a Set of integers because keys cannot be duplicates.
        Collection<String> values = test.values();//this is a Collection because Values can be duplicates.

        System.out.println(test);
        Set<Map.Entry<Integer, String>> set1 = test.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            /*  System.out.println((iterator1.next().getKey() + iterator1.next().getValue())); this has a flaw.
             **this will print the key for the first Entry and the value for the next(second) Entry.**/
            //The above big problem is solved by below code.

            Map.Entry<Integer, String> currentEntry = iterator1.next();
            System.out.println((currentEntry.getKey() + currentEntry.getValue()));

        }
    }
}
