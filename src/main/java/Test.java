public class Test { //test class to test the methods in String Class
    public static void main(String[] args) {
//        String c="abc".substring(1,3);
//        String b="abc".substring(1,2);
//        System.out.println(c);
//        System.out.println(b);
        //  String a=new String();// this tells that the String() is redundant. Replace with empty string.
        //the above statement is same as below
        //String ab="";//initializes the ab with default value (empty character sequence).

        String test = "Jesus Christ Never Fails";
        String test1 = "JeSus Christ Never Fails";
        String compare1="Asdbksd";
        String compare2="Zkjsdkb";
        System.out.println(test.charAt(10));// displays the character at index 10
        System.out.println(test.codePointAt(10));//displays the unicode of character at index 10
        System.out.println(test.codePointBefore(10));//displays the unicode of character before index 10(at index 9)
        System.out.println(test.codePointCount(9, 10));//Returns the number of Unicode code points in the specified text range of this String.
        System.out.println(test.compareTo(test1));//if both strings are equal, it returns 0. This comparison is based on the
        //unicode value of each character in the Strings.
        System.out.println(compare1.compareTo(compare2));
        System.out.println(compare1.compareToIgnoreCase(compare2));//it just ignores the case difference and compares the strings

        System.out.println("Shintu ".concat(test));//concatenates test string to the end of "Shintu"

        System.out.println(test.contains("ails"));//Returns true if and only if this string contains the specified sequence of char values.
        System.out.println("shintu".contentEquals("shintu"));//Compares this string to the specified CharSequence.
        // The result is true if and only if this String represents the same sequence of char values as the specified sequence
    }
}
