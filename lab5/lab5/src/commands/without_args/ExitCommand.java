package commands.without_args;

import interfaces.Command;

/**Класс для отработки команды exit*/
public class ExitCommand implements Command {
    public void execute(){
        System.exit(1);
    }
    public void description(){
        System.out.println("exit : завершить программу (без сохранения в файл)");
    }
}
