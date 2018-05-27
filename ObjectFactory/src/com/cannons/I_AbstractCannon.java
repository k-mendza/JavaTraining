package com.cannons;

import com.cannons.type.E_CannonType;

public interface I_AbstractCannon {
    E_CannonType getCannonType();
    int getFireRate();
    int getArmor();
    int getShotPower();
    int getFireRange();
    float getPrice();
}
