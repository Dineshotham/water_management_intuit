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

    @Test
    void slabCostCalculation(){
        assertEquals(calculateMethods.slabCostCalculation(3000),11500);
    }

    @Test
    void totalVolumeCalculation() {
        //Example 1 provided as part of the question description
        assertEquals(calculateMethods.totalVolumeCalculation(false,10),4500);
        //Sample input 1
        assertEquals(calculateMethods.totalVolumeCalculation(true,5),2400);
        //Sample input 2
        assertEquals(calculateMethods.totalVolumeCalculation(false,5),3000);
        //Sample input 3
        assertEquals(calculateMethods.totalVolumeCalculation(true,0),900);
    }

    @Test
    void totalCostCalculation() {
        //Example 1 provided as part of the question description
        assertEquals(calculateMethods.totalCostCalculation(false,10,1,5),13625);

        //Sample input 1
        assertEquals(calculateMethods.totalCostCalculation(true,5,3,7),5215);

        //Sample input 2
        assertEquals(calculateMethods.totalCostCalculation(false,5,2,1),5750);

        //Sample input 3
        assertEquals(calculateMethods.totalCostCalculation(true,0,1,2),1200);
    }


}