package P;

import java.util.HashMap;

public class Duplicate {

    public static void main(String[] args) {
        String str = "KrishnaRadha";

        HashMap<Character, Integer> map = new HashMap<>();
        	
        // Count each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print duplicates
        System.out.println("Duplicate characters are:");
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " = " + map.get(ch) + " times");
            }
        }
    }
}

