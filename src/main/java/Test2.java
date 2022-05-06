import java.util.ArrayList;
import java.util.List;

class Main {
     static int cound = 0;
    public static void main(String[] args) {
        if (cound < 3) {
            cound++;
            main(null);
        } else {
            return;
        }
        System.out.println("Hello World");
        List list = new ArrayList();
        list.add("hello");
        list.add(2);
        System.out.print(list.get(0) instanceof Object);// the get() returns the value at specified index. instance of object will return if it is true.
        System.out.print(list.get(1) instanceof Integer);//returns true. not the value.
        }
    }

