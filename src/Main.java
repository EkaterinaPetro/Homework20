import java.util.*;

public class Main {

    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static Set<String> strings = new HashSet<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
    static List<String> strings2 = List.of("один", "один", "два","два", "два", "три", "три", "три");

    public static void getOddNumbers() {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 !=0) {
                System.out.println(nums.get(i));
            }
        }
    }

    public static void getEvenNumbers() {
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 ==0 && nums.get(i - 1) != nums.get(i)) {
                System.out.println(nums.get(i));
            }
        }
    }

    public static void getUniqueWords() {
        System.out.println(strings);
    }

    public static void getNumberOfDuplicates() {
        Map<String, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < strings2.size(); i++) {
           if (duplicates.get(strings2.get(i)) != null) {
               duplicates.put(strings2.get(i), duplicates.get(strings2.get(i)) + 1);
           } else {
               duplicates.put(strings2.get(i), 1);
           }
        }
        System.out.println(duplicates);
    }

    public static void main(String[] args) {
        getOddNumbers();
        getEvenNumbers();
        getUniqueWords();
        getNumberOfDuplicates();
    }
}