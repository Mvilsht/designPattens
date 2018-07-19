package builder.builderRL1;

import java.util.ArrayList;
import java.util.List;

public class PersonsFactory {

    public static List<Person> createPersons() {

        List<Person> persons = new ArrayList<>();

        Person p1 = new Person.Builder().with(userData -> {
            userData.name = "test";
            userData.age =  77.2;
        }).build();
        persons.add(p1);

        Person p2 = new Person.Builder().with(userData -> {
            userData.name = "test1";
            userData.age = 777.3;
        }).build();
        persons.add(p2);

        return persons;
    }
}
