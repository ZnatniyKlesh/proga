package commands.without_args;

import interfaces.Command;
import managers.CollectionManager;
import managers.FileManager;

/**Класс для отработки команды save*/
public class SaveCommand implements Command {
    CollectionManager col_man;
    public SaveCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(){
        FileManager.save_collection(col_man);
    }
    public void description(){
        System.out.println("save : сохранить коллекцию в файл");
    }
}
