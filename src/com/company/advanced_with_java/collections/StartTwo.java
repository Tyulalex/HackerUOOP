package com.company.advanced_with_java.collections;

public class StartTwo {

    public static void main(String[] args) {
        Test test = () -> System.out.println("Hello");
        test.run();

        TestRunner testRunner = (name) -> {
            return name + "!";
        };
        System.out.println(testRunner.run("Hello"));
    }

    @FunctionalInterface
    public interface Test {
        void run();
    }

    @FunctionalInterface
    public interface TestRunner {
        String run(String name);
    }
}
