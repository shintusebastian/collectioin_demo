import java.util.*;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set <String>set=new TreeSet<>();// the string blueprint implements comparable interface. So, it will not throw any error
        set.add("Shintu");
//        set.add(null);//we cannot add a null value to a tree set.
        set.add("Neethu");
        set.add("Adeline");
        set.add("Jerin");
        set.add("Ashly");
        set.add("Tintu");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//this will print the null value at the very first line. Then
            //prints the sorted set.
        }
        TreeSet <Employee> set1=new TreeSet<>();
        set1.add(new Employee("Shintu", 123));//current object
        set1.add(new Employee("Ashly",234));//another object
//        set1.add(null);
        System.out.println( set1.comparator()); // This method is present only in the TreeSet class. This gives null.
        //Because it can only be applied to wrapper classes.
        System.out.println(set1);// this will throw a run time error if compare to is not defined in the Employee class
        // . It will give a class cast exception.
        // But we cannot enter a null value into a tree set. It will show null pointer exception. But, null can be added
        // to Hash set, and Linked hash set. Null means no reference, or no object.
        //in tree set,for every object we need to implement the comparable interface.
        //In tree set, it calls compare to method to compare the objects that are coming.
Set <Employee>family=new TreeSet<>(new CustomComparatorByName());//passing the custom comparator to the tree set
        //We can pass any collection to this Tree set. Such as array list, linked list etc.
        //Once they are put in the Tree Set, they will be arranged.
family.add(new Employee("Mercy", 56));
family.add(new Employee("Sebastian", 59));
family.add(new Employee("Tintu",33));
        System.out.println(family);

        List<Integer> list=Arrays.asList(19,47,36,87,25,95,73);
        TreeSet<Integer>numbers=new TreeSet<>(list);
        System.out.println(numbers.first());//prints the first element of the sorted list. It is a class specific method
        System.out.println(numbers.last());// prints the last element of the sorted list.
        System.out.println(numbers.tailSet(36));//this will print the tail set of elements from the element 36.
        //36 is the element number and not the index number. This will include the element 36 as well
        System.out.println(numbers.headSet(36));// this will print the head set of elements upto the element 36.
        // this will not include element 36
        System.out.println(numbers.subSet(2, 75));//This gives the elements within the specified range.
        //This prints the sub set of elements beginning from element 2 and between element 73, excluding 73.
        System.out.println(numbers);


    }
}
