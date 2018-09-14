import org.junit.Before;
import org.junit.Test;
import ro.sciit.collections.homework.Company;
import ro.sciit.collections.homework.Employee;
import ro.sciit.collections.homework.EmployeeComparator;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Company employeeTester;

    @Before
    public void setUp() {
        employeeTester = new Company();
    }


    @Test
    public void compareEmployeeBySeniority() {

        //when
        List<Employee> sortedEmployees = employeeTester.getEmployees();
        Collections.sort(sortedEmployees, new EmployeeComparator());

        //result
        assertEquals(employeeTester.employeesBySeniority(), sortedEmployees);
    }
}
