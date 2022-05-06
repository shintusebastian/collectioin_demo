import java.util.*;

public class testClass {
     int age=27;

    public static void main(String[] args) {
        String[] numbers = {"Shintu", "2345", "53", "34", "abc"};
        List<String> list = Arrays.asList(numbers);// the String array of numbers is converted into a list using as List();
        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(Arrays.toString(numbers));
        /*Very Important: Both line 11 and 12 gives the same result. Changes to the list will get reflected in
         the Array of numbers as well*/
        Iterator<String> iterator = list.iterator();
//        for(iterator.hasNext()){
//            System.out.println(iterator.next());
//            this code will not work for a for loop. For loop can only work on arrays or an instance of iterable.

        //only while loop can work on iterator by default implementation provided
        // .
        char ch = 'x';
        System.out.println((int) ch);//type casting to int. give the integer value of character x in unicode
        String s = "chjsd";
        //        System.out.println(Integer.parseInt(s)); throws number format exception.
        s = "12345";
        System.out.println(Integer.parseInt(s));// converts the string into integer.
//    System.out.println(age);
//     Important:Above code Displays that Non-static field 'age' cannot be referenced from a static context
HashSet<String> set=new HashSet<String>();
set.add("Shintu");
set.add("Neethu");
set.add("Adeline");
set.add("Jerin");
set.add("shintu");
Iterator<String> iter=set.iterator();
while(iter.hasNext()){
    System.out.println(iter.next());// we cannot ensure that the elements will get printed in the order they were inserted.
}
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains("Shintu"));
        System.out.println(set.toArray());
        System.out.println(set.stream().toArray());
        System.out.println(set.stream().sorted());


    }


}

