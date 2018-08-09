public class PersonSorter {
Person person;

    public static Person[] sortByAge(Person persons[]) {

        Person temp;
        boolean swap = false;

        while (swap == false) {
            swap = true;
            for (int i = 0; i < persons.length - 1; i++) {

                if (persons[i].getAge() > persons[i + 1].getAge()) {

                    temp = persons[i + 1];
                    persons[i + 1] = persons[i];
                    persons[i] = temp;
                    swap = false;
                }
            }
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }


        return persons;
    }



}

