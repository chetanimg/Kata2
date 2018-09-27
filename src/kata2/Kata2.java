
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,1,2,3};
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int value;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry   : map.entrySet()) {
            System.out.println("Key =" + entry.getKey() + ", Value =" + entry.getValue()); 
        }
    }
    
}
