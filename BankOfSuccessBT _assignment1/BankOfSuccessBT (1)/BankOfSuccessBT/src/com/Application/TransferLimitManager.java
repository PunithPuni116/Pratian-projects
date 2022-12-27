package com.Application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransferLimitManager {

    //Hash Map - Key (Privilege) Value (Double)
    //Have a class variable
    private static Map<Privilege, Double> transferLimits = new HashMap<Privilege, Double>();

    static {

        //Hard code the values into map
        transferLimits.put(Privilege.PREMIUM, 100000.00);
        transferLimits.put(Privilege.GOLD, 50000.00);
        transferLimits.put(Privilege.SILVER, 20000.00);

        //You read from a file and load the map
    }

    public double getTransferLimit(Privilege privilege){

        //Return the value if the Privilege is available
    	
    	return transferLimits.get(privilege);
    	
        //Write code here---------------------
        
    }
}
