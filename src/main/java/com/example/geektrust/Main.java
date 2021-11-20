package com.example.geektrust;

import com.example.wm.driver.WaterBillManager;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)  {
        try {
            WaterBillManager.calculateBill("sample_input/input1.txt");
            System.out.println("\n");
            WaterBillManager.calculateBill("sample_input/input2.txt");
            System.out.println("\n");
            WaterBillManager.calculateBill("sample_input/input3.txt");
            System.out.println("\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
