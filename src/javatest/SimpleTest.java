package javatest;

public class SimpleTest {
    public static void main(String... args) {
        System.out.println("Hello");
        Employee employee = new Employee();
        employee.doSomething();
        employee.something = "Hello";
    }

    static class AnotherEmployee extends Employee {
        @Override
        protected void doSomething() {
            super.doSomething();
            something = "Hello";
        }
    }
}
