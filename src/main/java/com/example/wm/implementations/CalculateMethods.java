package com.example.wm.implementations;
import com.example.wm.interfaces.*;

//All calculation methods
public class CalculateMethods implements calculations {

    @Override
    public int initialCostCalculation(int initialVolume,int r1, int r2 ) {
        int initialCost;
        int initVolume = initialVolume/(r1+r2);
        initialCost= initVolume*r1+(int)(initVolume*r2*1.5);
        return initialCost;
    }

    @Override
    public int slabCostCalculation(int volume) {
        return 0;
    }
    @Override
    public int initialVolumeCalculation(int type ){
        return 0;
    }
    @Override
    public int slabVolumeCalculation(int guests){
        return 0;
    }

    @Override
    public int totalCostCalculation(int initialCost, int slabCost) {
        return 0;
    }

}
