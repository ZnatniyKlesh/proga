package commands.without_args;

import interfaces.Command;
import managers.CollectionManager;

/**Класс для отработки команды clear*/
public class ClearCommand implements Command{
    CollectionManager col_man;
    public ClearCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(){
        this.col_man.clear_collection();
    }
    public void description(){
        System.out.println("clear : очистить коллекцию");
    }
}
