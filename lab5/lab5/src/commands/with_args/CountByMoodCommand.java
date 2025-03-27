package commands.with_args;

import interfaces.Command;
import mainData.enums.Mood;
import managers.CollectionManager;

/**Класс для отработки команды count by mood*/
public class CountByMoodCommand implements Command {
    CollectionManager col_man;
    public CountByMoodCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(String mood){
        this.col_man.count_by_mood(Mood.valueOf(mood));
    }
    public void description(){
        System.out.println("count_by_mood mood : вывести количество элементов, значение поля mood которых равно заданному");
    }
}
