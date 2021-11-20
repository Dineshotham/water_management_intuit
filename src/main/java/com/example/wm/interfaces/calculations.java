package com.example.wm.interfaces;
//List of all methods that are required for performing the computation
public interface calculations {
    int initialCostCalculation(int volume, int r1, int r2);
    int slabCostCalculation(int volume);
    int initialVolumeCalculation(int type );
    int slabVolumeCalculation(int guests);
    int totalCostCalculation(int initialCost,int slabCost);

}
