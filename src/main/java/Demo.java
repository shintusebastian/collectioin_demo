import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
//        try{
//            System.out.println("Hello World");
//        }
//        catch(Exception e) {
//            System.out.println("e");;
//        }
////        catch(ArithmeticException e) {//in this line, compiler says that the Arithmetic Exception has already been caught.
////            System.out.println("e");;
//        }
//        finally{
//            System.out.println("!");;
//        }
         int[] numbers= new int[5];
        numbers[0]=29;
        numbers[1]=65;
        numbers[2]=36;
        numbers[3]=96;
        numbers[4]=53;
        int sum=0; int largest=0;
        for(int i=0;i< numbers.length;i++){
           sum=sum+ numbers[i];
           if(numbers[i]>largest){
               largest=numbers[i];
           }

        }
        System.out.println(sum);
        System.out.println(largest);
        int total=0;
        int bigger=0;
        for(int i: numbers ){
            total=total+i;
            if (i>bigger){
                bigger=i;
            }

    }
        System.out.println(total);
        System.out.println(bigger);
        System.out.println(Arrays.stream(numbers).sum());
        System.out.println(Arrays.stream(numbers).max()); //code worked till here.
//        int fin=0, big=0;
//        Iterator <Integer>test= Arrays.stream(numbers).iterator();
//
//        while(test.hasNext()){
//            fin=test.next()+fin;
//            if(test.next()>big){
//                big= test.next();
//            }
//        }


    }
}
