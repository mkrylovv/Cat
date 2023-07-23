
import java.util.HashSet;
import java.util.Objects;

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Cat))
            return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Cat> catHashSet = new HashSet<>();

        Cat cat1 = new Cat("Tom", 3);
        Cat cat2 = new Cat("Garfield", 5);
        Cat cat3 = new Cat("Tom", 3); // Cat with the same parameters as cat1

        catHashSet.add(cat1);
        catHashSet.add(cat2);
        catHashSet.add(cat3);

        System.out.println("HashSet size: " + catHashSet.size());
        for (Cat cat : catHashSet) {
            System.out.println(cat.name + " - " + cat.age);
        }
    }
}
