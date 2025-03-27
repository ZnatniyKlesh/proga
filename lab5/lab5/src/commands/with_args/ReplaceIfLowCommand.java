package commands.with_args;

import interfaces.Command;
import managers.CollectionManager;
import tools.Console;

/**Класс для отработки команды replace if lowe*/
public class ReplaceIfLowCommand implements Command {
    CollectionManager col_man;
    Console console;
    public ReplaceIfLowCommand(CollectionManager col_man, Console console){
        this.col_man = col_man;
        this.console = console;
    }
    public void execute(String key){
        this.col_man.remove_if_low(Integer.valueOf(key), console);
    }
    public void description(){
        System.out.println("replace_if_lowe null {element} : заменить значение по ключу, если новое значение меньше старого");
    }
}
