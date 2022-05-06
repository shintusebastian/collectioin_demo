public class TestEnum {
    public static void main(String[] args) {
        Size s=Size.SMALL;
        Size[] values = Size.values();
        for(Size size:values){
            System.out.println(size);

        }
        //System.out.println(Size.valueOf("hsnf"));// this will check if the entered string matches the constants in the enum.
        // if not, it returns an exception that no enum constant is present like that.
        // we can convert this string into enum type using the value of method.
        Size small = Size.valueOf("SMALL");//String SMALL is converted to Size.
        String name = Size.SMALL.name();// this will give the String value of the enum SMALL.
        System.out.println(name);
        System.out.println(Size.SMALL.getSizeNumber());
        System.out.println(Size.MEDIUM.getSizeNumber());
        System.out.println(Size.LARGE.getSizeNumber());
    }

}
