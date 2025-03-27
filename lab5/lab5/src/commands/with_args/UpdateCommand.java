package commands.with_args;

import interfaces.Command;
import managers.CollectionManager;
import tools.Console;

/**Класс для отработки команды update*/
public class UpdateCommand implements Command {
    CollectionManager col_man;
    Console console;
    public UpdateCommand(CollectionManager col_man, Console console){
        this.col_man = col_man;
        this.console = console;
    }
    public void execute(String key){
        this.col_man.update_key(Integer.valueOf(key), console);
    }
    public void description(){
        System.out.println("update id {element} : обновить значение элемента коллекции, id которого равен заданному");
    }
}
