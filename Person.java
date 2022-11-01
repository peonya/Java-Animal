package Animal;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;

    }

    public void speak() {
        System.out.println(this.name + " говорит: Иди ко мне. ");
    }

    public void speakLoud() {
        System.out.println(this.name + " кричит на него: Брысь отсюда! ");
    }

    public String getName() {
        return name;
    }
}
