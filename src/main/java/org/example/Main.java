package org.example;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.example.TestName;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestName.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Все тесты были пройдены успешно: " + result.wasSuccessful());
    }
}