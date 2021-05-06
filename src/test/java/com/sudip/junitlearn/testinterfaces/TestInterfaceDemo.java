package com.sudip.junitlearn.testinterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterfaceDemo implements TestLifecycleLogger, TestInterfaceDynamicTestsDemo{

    @Test
    void isEqualValue() {
        assertEquals(1, "a".length(), "is always equal");
    }
}
