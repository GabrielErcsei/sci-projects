public class Main {

    public static void main(String[] args) {

        int i = 5;
        String name = "John";
        Person p = new Person("John", "Doe", 20);

        printDataType(p);
        printDataType(name);
        System.out.println(p);

        modifyInt(i);
        System.out.println(i);


        modifyPerson(p);
        System.out.println(p);
    }

    public static void modifyPerson(Person p2) {
     //p2 = null;
        p2.changeName("sadsa", "sadas");
    }

    public static void modifyInt(int v) {
        v = 6;
    }

    public static void printDataType(Object obj) {
        System.out.println(obj.getClass().getSimpleName());
    }
}
