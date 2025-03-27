package interfaces;

/**Интерфейс для определения каждой команды*/
public interface Command {
    /**Метод выполнения команды без аргумента*/
    default void execute(){
        System.out.println("Execute method");
    };
    /**Метод выполнения команды с аргумента*/
    default void execute(String o){
        System.out.println(o);
    };
    /**Метод вывода описания команды*/
    default void description(){
        System.out.println("... Command");
    };
}
