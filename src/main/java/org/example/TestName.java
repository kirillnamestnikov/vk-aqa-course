package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TestName{
    @Test
    public void testNameFirst(){
        String inputName = "Kirill";
        String myName = "Kirill";
        Assert.assertEquals("Имя совпадает", inputName, myName);
    }

    @Test
    public void testNameSecond(){
        String inputName = "John";
        String myName = "Kirill";
        Assert.assertNotEquals("Имя не совпадает", inputName, myName);
    }
};