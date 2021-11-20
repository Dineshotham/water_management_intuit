package com.example.wm.interfaces;
//List of all methods that are required for performing the computation
public interface calculations {
    int initialCostCalculation(int volume, int r1, int r2);
    int slabCostCalculation(int volume);
    int memberVolumeCalculation(int guests);
    int initialVolumeCalculation(boolean is2BHK);
    int totalVolumeCalculation(boolean is2BHK, int totalGuests);
    int totalCostCalculation(boolean is2BHK, int totalGuests, int r1, int r2);
}
