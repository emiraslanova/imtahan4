import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        String s = "aaa aa bbb ccc aa aaaa bbb";
        String[] sa = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s1: sa) {
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }
        for (String word:
             map.keySet()) {
            System.out.println(word+ " " +map.get(word));
        }
    }



    }

