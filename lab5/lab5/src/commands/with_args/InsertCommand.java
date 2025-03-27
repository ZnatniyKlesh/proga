package commands.with_args;

import interfaces.Command;
import managers.CollectionManager;
import tools.Console;

/**Класс для отработки команды insert*/
public class InsertCommand implements Command {
    CollectionManager col_man;
    Console console;
    public InsertCommand(CollectionManager col_man, Console console){
        this.col_man = col_man;
        this.console = console;
    }
    public void execute(String key){
        this.col_man.insert(Integer.valueOf(key), this.console);
    }
    public void description(){
        System.out.println("insert null {element} : добавить новый элемент с заданным ключом");
    }
}
