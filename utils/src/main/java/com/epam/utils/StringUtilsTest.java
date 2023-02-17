package com.epam.utils;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @org.junit.jupiter.api.Test
    void isPositiveNumber() {
        assertEquals(true,StringUtils.isPositiveNumber("5"));
        assertEquals(false,StringUtils.isPositiveNumber("-5"));
        assertEquals(false,StringUtils.isPositiveNumber(""));
        assertEquals(false,StringUtils.isPositiveNumber(" "));
        assertEquals(false,StringUtils.isPositiveNumber(null));
    }
}