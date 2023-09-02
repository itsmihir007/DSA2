package Hashmap;

import java.util.*;

public class Iterating {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("America");
        set.add("India");
        set.add("Canada");
        set.add("Srilanka");
        System.out.println(set);

        // 2nd way of iterating over hashset
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        for (String country : set){
          //  System.out.println(country);
        }

        //// *********** in linked hashset sets are placed in sorted order
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("America");
        lhs.add("India");
        lhs.add("Canada");
        lhs.add("Srilanka");
        System.out.println(lhs);

        //Tree set
        // sorted  in ascending order
        TreeSet<String> tree = new TreeSet<>();
        tree.add("America");
        tree.add("India");
        tree.add("Canada");
        tree.add("Srilanka");
        System.out.println(tree + "treeset");
    }
}
