package enums;

import java.util.concurrent.ThreadLocalRandom;

public enum Towns {
    NEW_YORK,
    WASHINGTON,
    LOS_ANGELES,
    SAN_FRANCISCO,
    CHICAGO,
    YORK,
    GULLE;

    public static Towns getRandomTown(){
        return Towns.values()[ThreadLocalRandom.current().nextInt(0,Towns.values().length)];
    }
}
