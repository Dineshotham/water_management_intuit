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
    public int initialVolumeCalculation(boolean is2BHK) {
        if(is2BHK)
            return memberVolumeCalculation(3);// 2BHK default members 3
        else
            return memberVolumeCalculation(5);// 3BHK default members 5
    }

    @Override
    public int memberVolumeCalculation(int totalMembers){
        return totalMembers*300;//totalGuests * 10L * 30 days
    }
    @Override
    public int totalVolumeCalculation(boolean is2BHK, int totalGuests){
        int initialVolumeCalculation = initialVolumeCalculation(is2BHK);
        int guestVolumeCalculation = memberVolumeCalculation(totalGuests);
        return initialVolumeCalculation+guestVolumeCalculation;
    }

    @Override
    public int totalCostCalculation(boolean is2BHK, int totalGuests, int r1, int r2) {
        int initialVolumeCalculation = initialVolumeCalculation(is2BHK);
        int guestVolumeCalculation = memberVolumeCalculation(totalGuests);
        int allottedCostCalculation = initialCostCalculation(initialVolumeCalculation,r1,r2);
        int tankerCostCalculation = slabCostCalculation(guestVolumeCalculation);
        return allottedCostCalculation+ tankerCostCalculation;
    }

}
