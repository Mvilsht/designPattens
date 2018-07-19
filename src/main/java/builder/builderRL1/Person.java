package builder.builderRL1;

import java.util.List;
import java.util.function.Consumer;

public class Person {

    private String name;
    private Double age;

    public Person(Builder Builder) {
        this.name = Builder.name;
        this.age = Builder.age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {

        public String name;
        public Double age;

        public Builder with(Consumer<Builder> function) {
            function.accept(this);
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {

        List<Person> people = PersonsFactory.createPersons();

        people.forEach(person -> System.out.println(person.toString()));
    }
}
