package commands.with_args;

import interfaces.Command;
import managers.ScriptManager;


/**
 * Класс для отработки команды execute_script
 */
public class ExecuteScript implements Command {
    public void execute(String file_name){
        ScriptManager.execute_script(file_name);
    }
    public void description(){
        System.out.println("execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
    }
}
