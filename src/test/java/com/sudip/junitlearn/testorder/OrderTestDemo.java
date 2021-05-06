package com.sudip.junitlearn.testorder;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OrderTestDemo {
    @Test
    @Order(1)
    void nullValues() {
        // perform assertions against null values
    }

    @Test
    @Order(2)
    void emptyValues() {
        // perform assertions against empty values
    }

    @Test
    @Order(3)
    void validValues() {
        // perform assertions against valid values
    }

}
