package com.sudip.junitlearn.disabledtest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Disabled until SE-19995 is fixed")
public class DisabledTest {
    @Test
    void testWillBeSkipped() {
    }
}
