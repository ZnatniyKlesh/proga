package commands.without_args;

import interfaces.Command;
import managers.CollectionManager;

/**Класс для отработки команды info*/
public class InfoCommand implements Command {
    CollectionManager col_man;
    public InfoCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(){
        System.out.println(this.col_man.get_all_info());
    }
    public void description(){
        System.out.println("info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
    }
}
