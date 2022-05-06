import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import mypackage.elementary.*;
import mypackage.Math1;


public class Demo2 {
    public static void main(String[] args) {
//        for (int i=0; i<10; i=i++){// if we hover over this line, it says that value of i++ is never used.
//            i+=2;// i=i+1;// if we declare the update code of i here, it will not increment by taking i++.
//            // now the loop will be taking this implementation for the iteration of i.
//            //Very important for the for loop.
//            System.out.println("Hello World!");
        List<Boolean> list=new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("False"));
        list.add(Boolean.TRUE);
        System.out.println(list.size());
        System.out.println(list.get(1) instanceof Boolean);
        String message="Hello World!";

        System.out.println(Math1.abs(123));
        System.out.println(LocalDate.now());// Local Date is the newest class added in Java 8.




    }
    }

