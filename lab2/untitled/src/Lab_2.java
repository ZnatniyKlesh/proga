import Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Lab_2 {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon p1 = new Solrock("Вася",1);
        Pokemon p2 = new Tyrogue("Петя",1);
        Pokemon p3 = new Hitmonlee("Дима",1);
        Pokemon p4 = new Trapinch("Коля",1);
        Pokemon p5 = new Vibrava("Миша",1);
        Pokemon p6 = new Flygon("Егор",1);
        battle.addAlly(p1);
        battle.addAlly(p2);
        battle.addAlly(p3);
        battle.addFoe(p4);
        battle.addFoe(p5);
        battle.addFoe(p6);

        battle.go();


    }
}
