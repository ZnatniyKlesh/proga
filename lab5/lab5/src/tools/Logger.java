package tools;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**Класс для записи и вывода команд, которые пользователь использовал*/
public abstract class Logger {
    /**Метод для записи используемых команд*/
    public static void log_command(String command){
        try(FileOutputStream fos=new FileOutputStream("./logging/logs.txt",true))
        {
            byte[] buffer = (command+"\n").getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    /**Получение последних 10 используемых команд*/
    public static void get_history(){
        try (FileInputStream fis = new FileInputStream("./logging/logs.txt")){
            StringBuilder history = new StringBuilder();
            int chr;
            while ((chr = fis.read()) != -1){
                history.append((char) chr);
            }
            List<String> commands = List.of(history.toString().split("\\r?\\n"));
            int len = commands.size();
            if (len>10) {
                commands = List.of(history.toString().split("\\r?\\n")).subList(len - 11, len - 1);
            }
            for (String command : commands){
                System.out.println(command);
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
