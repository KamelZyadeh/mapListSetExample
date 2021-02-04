import java.util.Comparator;
import java.util.Map;

public class ComparatorNameEntry implements Comparator<Map.Entry<Person, String>> {
    @Override
    public int compare(Map.Entry<Person, String> personStringEntry, Map.Entry<Person, String> t1) {
        String name = personStringEntry.getKey().getName();
        String name1 = t1.getKey().getName();
        return name.compareTo(name1);
    }
}
