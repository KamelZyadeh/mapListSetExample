import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Reem", "Al Sarrih"),
                new Person("Ziad", "Al Sarrih"),
                new Person("Kassem", "Al Sarrih"),
                new Person("Rayan", "Al Sarrih"),
                new Person("Ahmad", "Al Sarrih"),
                new Person("Ra2ouf", "Al Sarrih"),
                new Person("Kamel", "Al Sarrih"),
                new Person("Ali", "Al Sarrih")
        );

        personList.sort(new Comparator());
        System.out.println("sorted list");
        System.out.println(personList);

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Reem", "Al Sarrih"));
        personSet.add(new Person("Ziad", "Al Sarrih"));
        personSet.add(new Person("Kassem", "Al Sarrih"));
        personSet.add(new Person("Rayan", "Al Sarrih"));
        personSet.add(new Person("Ahmad", "Al Sarrih"));
        personSet.add(new Person("Ra2ouf", "Al Sarrih"));
        personSet.add(new Person("Kamel", "Al Sarrih"));
        personSet.add(new Person("Ali", "Al Sarrih"));

        Set<Person> collect = personSet.stream().sorted(new Comparator()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("sorted set");
        System.out.println(collect);

        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(new Person("Reem",   "Al Sarrih"), "1");
        hashMap.put(new Person("Ziad",   "Al Sarrih"), "2");
        hashMap.put(new Person("Kassem", "Al Sarrih"), "3");
        hashMap.put(new Person("Rayan",  "Al Sarrih"), "4");
        hashMap.put(new Person("Ahmad",  "Al Sarrih"), "5");
        hashMap.put(new Person("Ra2ouf", "Al Sarrih"), "6");
        hashMap.put(new Person("Kamel",  "Al Sarrih"), "7");
        hashMap.put(new Person("Ali",    "Al Sarrih"), "8");
        System.out.println("hashMap");
        List<Map.Entry<Person, String>> collect1 = hashMap.entrySet().stream().sorted(new ComparatorNameEntry()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
