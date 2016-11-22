package ejb;

import jpa.Employee;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by Mucefix on 22/11/16.
 */

@Local
public interface EmployeeFacade {

    public List<Employee> getEmployees();

}
