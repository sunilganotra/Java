package Animal;

public class AnimalApp {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Calls the overridden method in Dog class
        myCat.sound(); // Calls the overridden method in Cat class
    }

}
