package com.pmdtest.service;

import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionServiceTest {
    @Nested
    class getCount {
        private IntersectionService intersectionService;

        @Test
        void AイコールB() {
            intersectionService = new IntersectionService();
            int actual = intersectionService.getCount(1, List.of(2), List.of(2));
            assertEquals(0, actual);
        }
    }
}
