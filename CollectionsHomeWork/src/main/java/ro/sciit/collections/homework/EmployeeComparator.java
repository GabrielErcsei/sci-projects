package ro.sciit.collections.homework;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        Integer i = o1.getSeniority();
        return i.compareTo(o2.getSeniority());
    }
}
