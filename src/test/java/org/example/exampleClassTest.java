package org.example;

import junit.framework.TestCase;

public class exampleClassTest extends TestCase {

    public void testAdd() {
        exampleClass test = new exampleClass();
        assertEquals(3, test.add(1, 2));
    }
}