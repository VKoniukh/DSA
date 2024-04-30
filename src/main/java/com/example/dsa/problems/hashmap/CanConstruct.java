package com.example.dsa.problems.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.isEmpty()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        char[] arrMag = magazine.toCharArray();
        for (int i = 0; i <= arrMag.length - 1; i++) {
            map.put(arrMag[i], i);
        }

        char[] arr = ransomNote.toCharArray();

        for(int i = 0; i <= ransomNote.length() - 1; i++) {
            if(!map.containsKey(arr[i])) {
                return false;
            }
            if(map.get(arr[i]) != 0) {
                map.put(arr[i], map.get(arr[i]) - 1);

            } else {
                map.remove(arr[i], map.get(arr[i]));
            }
        }
        return true;
    }
}
