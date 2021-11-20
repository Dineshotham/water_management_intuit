package com.example.wm.driver;

import com.example.wm.implementations.CalculateMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WaterBillManager {

    public static void calculateBill(String fileName) throws FileNotFoundException {
        CalculateMethods calculateMethods = new CalculateMethods();
        int totalGuests=0;
        boolean is2bhk=false;
        int r1=0,r2=0;
        Scanner scanner = new Scanner(new File(fileName));
        while(scanner.hasNext()){
            String command = scanner.nextLine();
            if(command.contains("ALLOT_WATER")){
                String[] allotWatervalues =  command.split("\\s+");
                if(allotWatervalues[1].contains("2"))
                    is2bhk=true;
                //Ratio values r1,r2
                String[] ratioValues = allotWatervalues[2].split(":");
                r1= Integer.parseInt(ratioValues[0]);
                r2=Integer.parseInt(ratioValues[1]);
            }
            else if(command.contains("ADD_GUESTS")){
                String[] guests = command.split("\\s+");
                totalGuests+=Integer.parseInt(guests[1]);
            }
            else if(command.contains("BILL")){
                System.out.print(calculateMethods.totalVolumeCalculation(is2bhk,totalGuests));
                System.out.print(" ");
                System.out.print(calculateMethods.totalCostCalculation(is2bhk,totalGuests,r1,r2));
            }
            else{
                System.out.println("Invalid command");
            }
        }
    }
}

