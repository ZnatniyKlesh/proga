package commands.without_args;
import interfaces.Command;
import managers.CommandsManager;

import java.util.Map;

/**Класс для отработки команды help*/
public class HelpCommand implements Command{
    Map<String, Command> commands;
    public HelpCommand(Map<String, Command> commands){
        this.commands = commands;
    }
    public void execute(){
        for (Command command : commands.values())
            command.description();
    }
    public void description(){
        System.out.println("help : вывести справку по доступным командам");
    }
}
