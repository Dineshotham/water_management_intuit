package com.example.wm.implementations;
import com.example.wm.interfaces.*;

public class CalculateMethods implements calculations {

    @Override
    public int initialCostCalculation(int volume,int r1, int r2 ) {
        return 0;
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
