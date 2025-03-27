package commands.with_args;

import interfaces.Command;
import managers.CollectionManager;

/**Класс для отработки команды remove greater key*/
public class RemoveGreaterKeyCommand implements Command {
    CollectionManager col_man;
    public RemoveGreaterKeyCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(String data){
        this.col_man.remove_if_greater(Integer.valueOf(data));
    }
    public void description(){
        System.out.println("remove_greater_key null : удалить из коллекции все элементы, ключ которых превышает заданный");
    }
}
