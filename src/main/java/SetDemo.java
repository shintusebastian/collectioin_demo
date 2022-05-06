import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student>set=new TreeSet<>(/*(s1,s2)->s1.age-s2.age*/);//here, the tree set will sort the elements in the natural order of integers.
        //if it is another type, the natural order of that type will be followed unless we specify the sorting required.
        //either we can provide the implementation of compare to method inside the class itself, or we can use the
        //lambda expression to provide the definition of compare to method inside the parenthesis.
        set.add(new Student(45));
        set.add(new Student(85));
        set.add(new Student(18));
        set.add(new Student(64));
        System.out.println(set);
    }
     static class Student implements Comparable<Student>{
     private int age;
     public Student(int age){
         this.age=age;
     }

         @Override
         public String toString() {
             return "Student{" +
                     "age=" + age +
                     '}';
         }

         @Override
        public int compareTo(Student o) {//o is the another object which will come to us and one will be the current.
         // the object of current class is represented by this
            return this.age-o.age; // this will give the sorted set in the ascending order.
             //return o.age-this.age; will give the sorted set in the descending order.
        }

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             Student student = (Student) o;
             return age == student.age;
         }

         @Override
         public int hashCode() {
             return Objects.hash(age);
         }
     }
}
