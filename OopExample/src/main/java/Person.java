public class Person {
    String firstName = "Gabi";
    String lastName = "E";
    int age = 25;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
