package tools;

import mainData.enums.Mood;
import mainData.enums.WeaponType;

import java.util.Scanner;

/**Класс управления вводом и выводом*/
public class Console {
    private final Scanner scan;
    public Console() {
        this.scan = new Scanner(System.in);
    }
    public String next(){
        while (true){
            if (scan.hasNext()){
                return scan.nextLine();
            } else{
                System.out.print("Вы не ввели строку или ввели ее некорректно, попробуйте еще раз: ");
                scan.next();
            }
        }
    }
    public int next_int(){
        while (true){
            if (scan.hasNextInt()){
                return scan.nextInt();
            } else{
                System.out.print("Введенное значение не является числом или является некорректным, попробуйте еще раз: ");
                scan.next();
            }
        }
    }
    public boolean next_bool(){
        while (true){
            if (scan.hasNextBoolean()){
                boolean res = scan.nextBoolean();
                scan.nextLine();
                return res;

            } else{
                System.out.print("Введенное значение не является true/false, попробуйте еще раз: ");
                scan.next();
            }
        }
    }
    public WeaponType next_weapon(){
        while (true){
            if (scan.hasNext()){
                try {
                    return WeaponType.valueOf(scan.next());
                } catch (Exception e) {
                    System.out.print("Введенное значение не является доступным оружием (HAMMER, AXE, PISTOL, KNIFE), попробуйте еще раз: ");
                }
            } else{
                System.out.print("Введенное значение не является доступным оружием (HAMMER, AXE, PISTOL, KNIFE), попробуйте еще раз: ");
            }
        }
    }
    public Mood next_mood(){
        while (true){
            if (scan.hasNext()){
                try {
                    return Mood.valueOf(scan.next());
                } catch (Exception e) {
                    System.out.print("Введенное значение не является доступным настроением (GLOOM, CALM, RAGE, FRENZY), попробуйте еще раз: ");
                }
            } else{
                System.out.print("Введенное значение не является доступным оружием (HAMMER, AXE, PISTOL, KNIFE), попробуйте еще раз: ");
            }
        }
    }
    public Scanner get_scan(){
        return this.scan;
    }
}
