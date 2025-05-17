import java.util.*;

public class DupCharacters {
    public static void main(String[] args) {
        String str = "program";
        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate char:");
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
