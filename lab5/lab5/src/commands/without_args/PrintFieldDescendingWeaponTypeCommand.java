package commands.without_args;

import interfaces.Command;
import managers.CollectionManager;

/**Класс для отработки команды descending weapon print*/
public class PrintFieldDescendingWeaponTypeCommand implements Command {
    CollectionManager col_man;
    public PrintFieldDescendingWeaponTypeCommand(CollectionManager col_man){
        this.col_man = col_man;
    }
    public void execute(){
        this.col_man.descending_weapon_print();
    }
    public void description(){
        System.out.println("print_field_descending_weapon_type : вывести значения поля weaponType всех элементов в порядке убывания");
    }
}
