package commands.without_args;

import interfaces.Command;
import managers.CollectionManager;

/**Класс для отработки команды descending print*/
public class PrintDescendingCommand implements Command {
    CollectionManager col_man;
    public PrintDescendingCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(){
        this.col_man.descending_print();
    }
    public void description(){
        System.out.println("print_descending : вывести элементы коллекции в порядке убывания");
    }
}
