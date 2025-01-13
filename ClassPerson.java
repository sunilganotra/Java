// Person.java
public class ClassPerson {
  int age;
  String name;

  // Constructor method
  public ClassPerson(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public static void main(String[] args) {
	  ClassPerson Bob = new ClassPerson(31, "Bob");
	  ClassPerson Alice = new ClassPerson(27, "Alice");

	  System.out.println(Bob.name + " is " + Bob.age + ".");
	  System.out.println(Alice.name + " is " + Alice.age + ".");
  }
}
