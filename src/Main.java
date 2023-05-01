import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {


    }

    public static void map(String str) {
        String[] s = str.split("");
        for (int i = 0; i < s.length; i++) {
            map.put(i,s[i]);
        }


    }
}
