public class Comparator implements java.util.Comparator<Person> {

    @Override
    public int compare(Person person, Person t1) {
        return person.getName().compareTo(t1.getName());
    }
}
