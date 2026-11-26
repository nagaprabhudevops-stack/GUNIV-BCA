
package com.guniv.bca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void greetReturnsExpectedMessage() {
        assertEquals("Hello, Jenkins!", new App().greet("Jenkins"));
    }
}
