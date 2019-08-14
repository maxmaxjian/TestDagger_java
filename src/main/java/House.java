import javax.inject.Inject;

public class House {
    private Dog dog;
    private Cat cat;

    @Inject
    public House(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public void print() {
        dog.print();
        cat.print();
    }
}
