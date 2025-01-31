package hashmap_hashing.custom_hashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map.get("two")); // Output: 2
        map.remove("two");
        System.out.println(map.get("two")); // Output: null
        System.out.println(map.containsKey("three")); // Output: true
    }
}