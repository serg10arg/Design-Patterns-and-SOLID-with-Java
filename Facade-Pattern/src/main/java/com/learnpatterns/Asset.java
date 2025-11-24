package com.learnpatterns;

public class Asset {

    /**
     * Verifica si el valor del activo es mayor o igual al monto solicitado
     */
    public boolean hasSufficientAssetValue(Person person, double claimAmount) {

        System.out.println("Verifying " + person.name + "'s asset value.");
        return person.assetValue >= claimAmount ? true : false;
    }
}
