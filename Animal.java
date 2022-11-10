package Animal;

public abstract class Animal implements Comparable<Animal> {

    String name;
    Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }

}

