package enums;

import people.Person;

public enum LivingStatuses {
    DEAD,
    MISSING,
    ALIVE;
    public static String getLivingStatus(Person obj){
        switch (obj.living_status){
            case ALIVE: return "%s живой и здоровый".formatted(obj.NAME);
            case DEAD: return "%s погиб".formatted(obj.NAME);
            case MISSING: return "%s пропал без вести".formatted(obj.NAME);
            default: return "Undefined";
        }
    }
    public static void setLivingStatus(LivingStatuses status, Person obj){
        obj.living_status = status;
    }
}
