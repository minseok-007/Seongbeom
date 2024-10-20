package DataStructure;

import java.util.HashSet;
import java.util.Set;

public class DS_Set {
    public static void main(String[] args) {
        // no duplication
        // no order (does not maintain the order of which the element is added)

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Apple");
        System.out.println(set.size());
        set.remove("Apple");
        System.out.println(set.size());
    }
}
