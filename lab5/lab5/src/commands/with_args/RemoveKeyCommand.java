package commands.with_args;

import interfaces.Command;
import managers.CollectionManager;

/**Класс для отработки команды remove key*/
public class RemoveKeyCommand implements Command {
    CollectionManager col_man;
    public RemoveKeyCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(String key){
        this.col_man.remove_key(Integer.valueOf(key));
    }
    public void description(){
        System.out.println("remove_key null : удалить элемент из коллекции по его ключу");
    }
}
