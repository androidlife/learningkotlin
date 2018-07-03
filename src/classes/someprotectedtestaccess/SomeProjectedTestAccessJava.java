package classes.someprotectedtestaccess;

import classes.someprotectedtest.SomeProtectedJava;

public class SomeProjectedTestAccessJava {
    public static void main(String... args) {
        SomeProtectedJava someProtectedJava = new SomeProtectedJava();
        //can't be accessible outside the package
        //someProtectedJava.someName
    }

    static class SomeExtendingClass extends SomeProtectedJava {
        public void someFunction() {
            System.out.println("I can access the protected scope as I am extending it" + someName);
        }
    }
}
