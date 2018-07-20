import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.*;

public class testMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int selection;
        out.println("HashMAP 1 - Press 1");
        out.println("HashMAP 2 - Press 2");
        selection = sc.nextInt();

        switch (selection) {

            case 1:
                out.println("Option 1 selected");
                Map<String, String> objMap = new HashMap<String, String>();
                objMap.put("Name", "Suzuki");
                objMap.put("Type", "Swift");
                objMap.put("Power", "1.4");
                objMap.put("Type", "4-wheeler");
                objMap.put("Price", "15000");
                out.println("Elements of the Map:");
                out.println(objMap);
                break;

            case 2:
                out.println("Option 2 selected");
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1,"BMW");
                map.put(2, "SUZUKI");
                map.put(3, "VW");
                map.put(4, "VOLVO");
                map.put(5, "AUDI");
                out.println("Elements of the Map: "+ map);
                // Remove value of key 5
                map.remove(5);
                out.println("Elements of the Map After Remove: "+ map);
                break;

            default:
                out.println("No selection");
                break;
        }
        out.println("Simple HashMap Example :)");
    }
}































