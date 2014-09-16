/**
 * Created by Andrew Towe on 9/16/2014.
 */
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static Random Dice=new Random();
    public static ArrayList<Item> minor=new ArrayList<Item>();
    public static ArrayList<Item> major=new ArrayList<Item>();
    public static ArrayList<Mod> armormodifiers=new ArrayList<Mod>();
    public static ArrayList<Mod> armsmodifiers=new ArrayList<Mod>();
    public static ArrayList<Item> chosen=new ArrayList<Item>();
    public static void main(String args[]){
        boolean failflag=false;
        if(args.length>=1) {
            populateLists(args[0]);
        }else{
            System.out.println("Where am I populating my Roll table from?");
        }
        if (!failflag) {
            if (args.length == 4) {
                rolldice(args[1] + " " + args[2] + " " + args[3]);
            } else if (args.length == 3) {
                rolldice(args[1] + " " + args[2]);
            } else if (args.length == 2) {
                rolldice(args[1]);
            } else {
                System.out.println("How many items do you want?");
            }
        }
        if (!failflag) {
            printout();
        }

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
