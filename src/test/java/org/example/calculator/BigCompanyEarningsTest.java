package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BigCompanyEarningsTest {

    @Test
    void testMain() {
        Assertions
                .assertDoesNotThrow(() -> BigCompanyEarnings.main(new String[0]));
    }
}
