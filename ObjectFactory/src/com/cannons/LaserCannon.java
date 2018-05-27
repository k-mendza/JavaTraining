package com.cannons;

import com.cannons.type.E_CannonType;

public class LaserCannon extends AbstractCannon{

    LaserCannon(){
        this.cannonType = E_CannonType.LASER_CANNON;
        this.fireRate = 100;
        this.fireRange = 150;
        this.armor = 15;
        this.shotPower = 50;
    }

    void setPrice(float price){
        this.price = price;
    }

}
