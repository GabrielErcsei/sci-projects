public class Main {

    public static void main(String[] args) {
        Person[] unsorted = new Person[5];

        unsorted[0] = new Person("a", "b",25 );
        unsorted[1] = new Person("z", "p",11 );
        unsorted[2] = new Person("s", "o",15 );
        unsorted[3] = new Person("u", "t",53 );
        unsorted[4] = new Person("h", "r",81 );

        PersonSorter bubbleSort = new PersonSorter();
        Person[] sorted = bubbleSort.sortByAge(unsorted);

        for (Person person : unsorted) {
            System.out.println((person.getAge()));
        }









    }

}
