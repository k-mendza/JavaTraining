package com.cannons;

import com.cannons.type.E_CannonType;

public class PlasmaCannon extends AbstractCannon{

    PlasmaCannon(){
        this.cannonType = E_CannonType.PLASMA_CANNON;
        this.fireRate = 20;
        this.fireRange = 500;
        this.armor = 75;
        this.shotPower = 200;
    }

    void setPrice(float price){
        this.price = price;
    }
}
