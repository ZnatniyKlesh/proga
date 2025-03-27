package commands.without_args;

import interfaces.Command;
import managers.CollectionManager;

/**Класс для отработки команды show*/
public class ShowCommand implements Command {
    CollectionManager col_man;
    public ShowCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(){
        this.col_man.print_all();
    }
    public void description(){
        System.out.println("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }
}
