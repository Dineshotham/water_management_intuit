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
        if(volume<=500){
            return volume*2;
        }
        else if(volume<=1500){
            return 500 *2 + (volume-500)*3;
        }
        else if(volume<=3000){
            return 500*2+ 1000*3 + (volume-1500)*5;
        }
        else{
            return 500*2+1000*3+1500*5+(volume-3000)*8;
        }
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
