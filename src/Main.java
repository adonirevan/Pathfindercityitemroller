/**
 * Created by Andrew Towe on 9/16/2014.
 */
import java.util.Random;
import java.util.ArrayList;
import java.io.Console;
public class Main {
    public static Random Dice=new Random();
    public static ArrayList<Item> minor=new ArrayList<Item>();
    public static ArrayList<Item> major=new ArrayList<Item>();
    public static ArrayList<Mod> armormodifiers=new ArrayList<Mod>();
    public static ArrayList<Mod> armsmodifiers=new ArrayList<Mod>();
    public static ArrayList<Item> chosen=new ArrayList<Item>();
    public static void main(String args[]){
        if(args.length>=1) {
            populateLists(args[0]);
        }else{
            Console console = System.console();
            String input = console.readLine("Where am I populating my Roll table from? :");
            populateLists(input);
        }
        if (args.length == 4) {
                rolldice(args[1] + " " + args[2] + " " + args[3]);
        } else if (args.length == 3) {
                rolldice(args[1] + " " + args[2]);
        } else if (args.length == 2) {
                rolldice(args[1]);
        } else {
            Console console = System.console();
            System.out.println("Where am I populating my Roll table from? :");
            String input1 = console.readLine("Minor:");
            String arguments = input1;
            String input2 = console.readLine("Medium:");
            arguments = arguments + " " + input2;
            String input3 = console.readLine("Major:");
            arguments = arguments + " " + input3;
            rolldice(arguments);
        }
        printout();
    }
    public static void populateLists(String input){
        System.out.println(input);
    }
    public static void rolldice(String input){
        System.out.println(input);
    }
    public static void printout(){

    }
}
