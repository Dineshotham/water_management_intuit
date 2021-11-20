package com.example.wm.implementations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateMethodsTest {

    private CalculateMethods calculateMethods;

    @BeforeEach
    void setUp() {
        calculateMethods= new CalculateMethods();
    }

    @Test
    void initialCostCalculation() {
        assertEquals(calculateMethods.initialCostCalculation(1500,1,5),2125);
    }
}