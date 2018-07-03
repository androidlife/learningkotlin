package classes.someprotectedtest;

public class SomeProtectedJavaAccess {
    public static void main(String... args){
        SomeProtectedJava someProtectedJava = new SomeProtectedJava();
        //here I am able to access the protected one as we are in the same package
        // in java protected means: object within same package can access
        // and subclasses anywhere can access
        System.out.println(someProtectedJava.someName);
    }
}
