public class PersonSorter {
Person person;

    /**
     * Method for sorting persons by age
     * temp - variable for temporary storage of a sort cycle
     * boolean swap - variable for doing another sorting cycle
     * condition while - boolean is assigned a true value so as long swap is true, another swap cycle is done
     * condition if - checks to see if the position of the variable i is greater than i + 1
     * @return
     */
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

