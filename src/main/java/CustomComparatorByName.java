import java.util.Comparator;

public class CustomComparatorByName implements Comparator <Employee>{/* It means we are implementing Comparator interface using
Custom Comparator class for comparing Employee type objects. We specify the Comparator for which blueprint.*/
//Comparator interface is having only one abstract method that is compare().
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getName().compareTo(o1.getName());//this will arrange the objects in reverse alphabetical order.
    }
}
