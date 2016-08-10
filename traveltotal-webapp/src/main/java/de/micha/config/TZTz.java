package de.micha.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by micha on 27.04.15.
 */
public class TZTz {
    public static void main(String[] args) {

        // make that class var
        Map<String,List<String>> invalidMap = new HashMap<String, List<String>>(){{
            put("make", new ArrayList<String>());
            put("model", new ArrayList<String>());
            put("seats", new ArrayList<String>());
        }};

        invalidMap.get("make").add("22 ,22 ,22");
        invalidMap.get("make").add("22 ,55 ,66");
        invalidMap.get("seats").add("22 55 ,22");

        for (Map.Entry<String,List<String>> invalid : invalidMap.entrySet()) {
            System.out.printf("\ncount of invalid %s: %d\n", invalid.getKey(), invalid.getValue().size());
            for (String s : invalid.getValue()) {
                System.out.printf("%s %s\n", invalid.getKey(),s);
            }
        }

    }
}
