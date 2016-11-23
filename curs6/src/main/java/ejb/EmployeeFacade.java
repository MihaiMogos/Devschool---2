package ejb;

import jpa.Employee;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */

@Local
public interface EmployeeFacade {

    List<Employee> getEmployees();
    void addEmployee(Employee employee);

}
