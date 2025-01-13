class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // Create an original object
        Person person1 = new Person("Alice", 30);

        // Create a copy of the original object using the copy constructor
        Person person2 = new Person(person1);

        // Display both objects
        System.out.println(person1); // Output: Person{name='Alice', age=30}
        System.out.println(person2); // Output: Person{name='Alice', age=30}
        
        // Modifying the copy
        person2.setName("Bob");
        person2.setAge(25);
        
        // Display both objects after modification
        System.out.println(person1); // Output: Person{name='Alice', age=30}
        System.out.println(person2); // Output: Person{name='Bob', age=25}
    }
}
