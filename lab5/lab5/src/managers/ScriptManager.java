package managers;

import interfaces.Command;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**Класс управления скриптом*/
public abstract class ScriptManager {
    private static ArrayList<String> running_files = new ArrayList<>();
    public static void execute_script(String file_name){
        if (!running_files.contains(file_name)) {
            running_files.add(file_name);
            try {
                FileInputStream in_stream = new FileInputStream("./scripts/" + file_name);
                InputStreamReader stream_reader = new InputStreamReader(in_stream);
                StringBuilder text = new StringBuilder();
                while (stream_reader.ready()) {
                    text.append((char) stream_reader.read());
                }
                String[] comms = text.toString().split("\\r?\\n");
                for (String comm : comms) {
                    String[] tokens = comm.split(" ");
                    System.out.println(Arrays.toString(tokens));
                    Command command = CommandsManager.get_current_commands().get(tokens[0]);
                    if (tokens.length > 1) {
                        command.execute(tokens[1]);
                    } else {
                        command.execute();
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File hasn't been found!");
            } catch (IOException e) {
                System.out.println("Input/Output error!");
            } catch (Exception e) {
                System.out.println(e + "\nКоманда не найдена! Для вывода списка всех существующих команд введите help");
            }
        }
    }
}
