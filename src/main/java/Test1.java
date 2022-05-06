public class Test1  {
    Object message(){ return "Hello!";
} public static void main(String[] args) {
    System.out.print(new Test1().message());
    System.out.print(new Main2().message()); }}
class Main2 extends Test1 { String message(){ return "World!";  }}

