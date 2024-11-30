package interfaces;
import people.Person;

public interface Marriable {
    default void marry(Person fiance) {
        System.out.println("You have to override this method!!!");
    };
}
