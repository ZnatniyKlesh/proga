package managers;

import commands.with_args.*;
import commands.without_args.*;
import interfaces.Command;
import tools.Console;

import java.util.HashMap;
import java.util.Map;

/**Класс управления командами*/
public abstract class CommandsManager {
    private static Map<String, Command> storage_commands;
    public static Map<String, Command> get_new_commands(CollectionManager col_man, Console console){
        Map<String, Command> commands = new HashMap<String, Command>();
        //without argument
        commands.put("help", new HelpCommand(commands));
        commands.put("info", new InfoCommand(col_man));
        commands.put("exit", new ExitCommand());
        commands.put("show", new ShowCommand(col_man));
        commands.put("clear", new ClearCommand(col_man));
        commands.put("save", new SaveCommand(col_man));
        commands.put("history", new HistoryCommand());
        commands.put("print_descending", new PrintDescendingCommand(col_man));
        commands.put("print_field_descending_weapon_type", new PrintFieldDescendingWeaponTypeCommand(col_man));
        //with argument
        commands.put("insert", new InsertCommand(col_man, console));
        commands.put("update", new UpdateCommand(col_man, console));
        commands.put("remove_key", new RemoveKeyCommand(col_man));
        commands.put("execute_script", new ExecuteScript());
        commands.put("replace_if_lowe", new ReplaceIfLowCommand(col_man, console));
        commands.put("remove_greater", new RemoveGreaterKeyCommand(col_man));
        commands.put("count_by_mood", new CountByMoodCommand(col_man));
        storage_commands = commands;
        return commands;
    }
    public static Map<String, Command> get_current_commands() {
        return storage_commands;
    }
}
