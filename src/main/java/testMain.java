import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testMain { // never understood the logic.
    static int count=0;
    public static void main(String[] args) {
        if(count<3) {
            count++;
            main(null);
        } else {
            return;
        }
        System.out.println("Hello World!");

        String[] array = {"abc", "2", "10", "0"};
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(Arrays.toString(array));

        int arr[]=new int[5];
arr[0]=6;
arr[1]=8;
arr[2]=3;
arr[3]=10;
arr[4]=44;
        System.out.println(Arrays.toString(arr));
}
}