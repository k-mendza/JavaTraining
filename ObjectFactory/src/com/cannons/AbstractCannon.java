package com.cannons;

import com.cannons.type.E_CannonType;

public abstract class AbstractCannon implements I_AbstractCannon{
    protected E_CannonType cannonType;
    protected int fireRate;
    protected int armor;
    protected int shotPower;
    protected int fireRange;
    protected float price;

    @Override
    public String toString() {
        return  "cannonType=" + cannonType  + "\n" +
                "fireRate=" + fireRate + "\n" +
                "armor=" + armor + "\n" +
                "shotPower=" + shotPower + "\n" +
                "fireRange=" + fireRange + "\n";
    }

    @Override
    public E_CannonType getCannonType() {
        return cannonType;
    }

    @Override
    public int getFireRate() {
        return fireRate;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getShotPower() {
        return shotPower;
    }

    @Override
    public int getFireRange() {
        return fireRange;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
