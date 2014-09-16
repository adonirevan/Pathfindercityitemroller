/**
 * Created by Andrew Towe on 9/16/2014.
 */
import java.util.ArrayList;
public class Item {
    public ArrayList<Integer>numbers=new ArrayList<Integer>();
    public int modflag;
    public String name;
    public void main(ArrayList<Integer> range, int flag, String n ){
        numbers=range;
        modflag=flag;
        name=n;
    }
    public String toString(){
        return "Item: "+name;
    }
}
