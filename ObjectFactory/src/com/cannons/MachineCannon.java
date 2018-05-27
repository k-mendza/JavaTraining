package com.cannons;

import com.cannons.type.E_CannonType;

public class MachineCannon extends AbstractCannon {

    MachineCannon(){
        this.cannonType = E_CannonType.MACHINE_CANNON;
        this.fireRate = 500;
        this.fireRange = 50;
        this.armor = 5;
        this.shotPower = 40;
    }

    void setPrice(float price){
        this.price = price;
    }
}
