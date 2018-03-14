package javatest.other;

import javatest.Employee;

import java.util.HashMap;
import java.util.Map;

public class OtherTest {
    public static void main(String... args) {
        //Employee employee = new Employee();
        String someDocument = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
        someDocument = someDocument.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String[] someDocArr = someDocument.split("\\s");
        System.out.println(someDocument);
        HashMap<String, Integer> occurenceMap = new HashMap<>();
        for (String val : someDocArr) {
            Integer count = occurenceMap.get(val);
            if (count == null)
                occurenceMap.put(val, 1);
            else
                occurenceMap.put(val, ++count);
        }

        for (Map.Entry<String, Integer> entry : occurenceMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    static class SomeOtherEmployee extends Employee {
        @Override
        protected void doSomething() {
            super.doSomething();
            something = "Hello";
        }
    }
}
