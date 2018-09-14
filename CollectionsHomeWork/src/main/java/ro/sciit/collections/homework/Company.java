package ro.sciit.collections.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {
    private List<Employee> totalEmployees = new ArrayList<Employee>();
    private List<Employee> managers = new ArrayList<Employee>();
    private List<Employee> midRankedEmployees = new ArrayList<Employee>();


    /**
     * Constructor initialises new hardcoded objects and add them to the corresponding lits
     * All lists are added to the total employees list
     */
    public Company() {
        managers.add(new Manager("Daniel", "Istrate", "Manager", true, 4));
        managers.add(new Manager("George", "Domide", "Manager", true, 11));
        managers.add(new Manager("Ionut", "Pop", "Manager", true, 7));
        managers.add(new Manager("Daniel", "Ionescu", "Manager", true, 4));
        managers.add(new Manager("Ilie", "Iosif", "Manager", true, 10));
        managers.add(new HrMember("Anda", "Pascu", "Hr Manager", true, 7));
        midRankedEmployees.add(new SoftwareEngineer("Alexandru", "Marginean", "Software Engineer", false, 5));
        midRankedEmployees.add(new SoftwareEngineer("Dan", "Popescu", "Software Engineer", false, 2));
        midRankedEmployees.add(new HrMember("Alexandru", "Campean", "Hr Member", false, 3));
        midRankedEmployees.add(new SoftwareEngineer("Ionela", "Prian", "Software Engineer", false, 4));
        midRankedEmployees.add(new SoftwareEngineer("Carmen", "Gliga", "Software Engineer", false, 2));
        midRankedEmployees.add(new HrMember("Ioana", "Pop", "Hr Member", false, 3));
        midRankedEmployees.add(new JuniorSoftwareEngineer("Gabriel", "Ercsei", "Junior Software Engineer", false, 1));
        midRankedEmployees.add(new JuniorSoftwareEngineer("Bogdan", "Muntean", "Junior Software Engineer", false, 1));
        midRankedEmployees.add(new JuniorSoftwareEngineer("Florin", "Serban", "Junior Software Engineer", false, 1));

        totalEmployees.addAll(managers);
        totalEmployees.addAll(midRankedEmployees);
    }

    /**
     *
     * @return reference to the total employee list
     */

    public List<Employee> getEmployees() {
        return totalEmployees;
    }

    /**
     * Method used for sorting the list
     *
     * @return string containing the sorted values from the list
     */
    public List<Employee> employeesBySeniority() {
        //String used for storing the sorted list
        String employeeBySeniority = "";
        List<Employee> sortedBySeniority = new ArrayList<Employee>(totalEmployees);

        //Functions that sorts the list. Takes 2 parameters, one being the list we want to sort, the other is the comparator
        Collections.sort(totalEmployees, new EmployeeComparator());

        //Goes through the list and add each element to the string
        for (int i = 0; i < totalEmployees.size(); i++) {
                employeeBySeniority += totalEmployees.get(i) + "\n";
        }

        //Prints each element in the string on a anew line
        for (Employee e : totalEmployees) {
            System.out.println(e);
        }
        return sortedBySeniority;
    }

    @Override
    public String toString() {
        return "Company{" +
                "totalEmployees=" + totalEmployees +
                ", managers=" + managers +
                ", midRankedEmployees=" + midRankedEmployees +
                '}';
    }
}
