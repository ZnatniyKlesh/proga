package enums;

import people.Person;

public enum Relative_statuses {
    MARRIED,
    SINGLE,
    DIVORCED;
    public static String getRelative_status(Person obj){
        switch (obj.relative_status){
            case SINGLE: return "Single";
            case DIVORCED: return "Divorced";
            case MARRIED: return "Married";
            default: return "Undefined";
        }
    }
}
