package com.karmen;

import com.cannons.CannonsCreator;
import com.cannons.I_AbstractCannon;
import com.cannons.type.E_CannonType;

public class Main {

    public static void main(String[] args) {
        // CannonsCreator is a singleton
	    CannonsCreator cannonsCreator = CannonsCreator.getInstance();
	    I_AbstractCannon laserCannon = cannonsCreator.create(E_CannonType.LASER_CANNON);
        I_AbstractCannon machineCannon = cannonsCreator.create(E_CannonType.MACHINE_CANNON);
        I_AbstractCannon plasmaCannon = cannonsCreator.create(E_CannonType.PLASMA_CANNON);
        // testing the objects for validity
        System.out.println(laserCannon);
        System.out.println(machineCannon);
        System.out.println(plasmaCannon);
    }
}
