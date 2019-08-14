import javax.inject.Inject;

public class Dog implements Animal {

    @Inject
    public Dog() {}

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " wang wang!");
    }
}
