package enums;

import java.util.concurrent.ThreadLocalRandom;

public enum Jobs {
    TRADER,
    WARRIOR,
    WRITER,
    BUILDER,
    THIEF,
    MINER;
    public static Jobs getJob(){
        return Jobs.values()[ThreadLocalRandom.current().nextInt(0,Jobs.values().length)];
    }
}
