package com.cannons;

import com.cannons.type.E_CannonType;

public interface I_CannonCreator {
    public abstract I_AbstractCannon create(E_CannonType cannonType);
}
