package commands.without_args;

import interfaces.Command;
import tools.Logger;

/**Класс для отработки команды history*/
public class HistoryCommand implements Command {
    public void execute(){
        Logger.get_history();
    }
    public void description(){
        System.out.println("history : вывести последние 10 команд (без их аргументов)");
    }
}
