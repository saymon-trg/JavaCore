package DZ4;

import java.util.*;

public class Task1 {
        public static void main(String[] args) {
            String[] names = {"Anton", "Anton", "Anna", "Ivan", "Petya",
                    "Anna", "Tanya", "Ivan", "Fedor", "Petya", "Tanya"};
            System.out.println(findUniqueNames(names));
            for (String s: findUniqueNames(names)) {
                int value = 0;
                for (String s1: names) {
                    if (s.equals(s1)) {
                        value++;
                    }
                }
                System.out.println(s + " " + value);
            }
        }

        static Set<String> findUniqueNames(String[] nameArray) {
            Set<String> uniqueNames = new HashSet<>();
            uniqueNames.addAll(Arrays.asList(nameArray));
            return uniqueNames;
        }
}
