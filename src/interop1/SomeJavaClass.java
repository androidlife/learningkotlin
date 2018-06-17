package interop1;

public class SomeJavaClass {
    public static void main(String... args) {
        SomeKt someKt = new SomeKt(10);
        System.out.println(someKt.name);
        //in order to access the default value
        // we need to write some override
        someKt.setKtType();
    }
}
