import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMapSlide106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(3, 'A');
        treeMap.put(5, 'B');
        treeMap.put(4, 'C');
        treeMap.put(2, 'D');
        treeMap.put(6, 'G');
        treeMap.put(9, 'U');
        Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        System.out.println(" cac entry co trong setTreeMap ");
        System.out.println(setTreeMap);
    }
}
