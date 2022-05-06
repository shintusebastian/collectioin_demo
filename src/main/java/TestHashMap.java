import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Shintu");// adds a (key,value) pair to the hash map. Put is used to update the key.
        map.putIfAbsent(1,"Pooja");//update the key1 with value Pooja only if the key 1 is absent.
        //use putIfAbsent if our intention is to add.
       // map.put(1,"Pooja"); This will update the key 1 with value Pooja.
        map.put(2,"xyz");
        System.out.println(map);//displays map by calling the to String method.
        System.out.println(map.get(1));// here we pass the key and get the value out of it.
       // map.clear(); will clear the whole map
        System.out.println(map.containsKey(1));//Checks if the map contains the specified key or not.
        System.out.println(map.containsValue("Shintu"));// checks if the map contains the specified value or not.
        map.getOrDefault(55,"not found");/*Here we are saying, if you are able to find the key,
        give me the value. If you're not able to find the key, give me the default value.*/


        Set<Map.Entry<Integer, String>> entries = map.entrySet();//The entries are not duplicate. That's why it returned  a set.
//this will create the set of all the entries in the map. Now, we can create the iterator() on this entries.

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();// now we got an iterator object.
        while(iterator.hasNext()){
//            System.out.println(iterator.next());// this will give each entry(key,value).To get key or value we put a dot.
            System.out.println((iterator.next().getKey()) +  (iterator.next().getValue()));//this prints both the key and value
            // in the first entry.




        }
    }
}
