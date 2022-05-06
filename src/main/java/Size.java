public enum Size {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);//these are the objects. Only 3 objects will be there for this enum.
    //If enum has constructors, it has to be private.
    private int sizeNumber;
private Size(int s){
this.sizeNumber=s;
}
//the properties are exposed to do inter-conversions.
    public int getSizeNumber() {
        return sizeNumber;
    }
}
