package jsf.model.employee;

import ejb.EmployeeFacade;
import jpa.Employee;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
@ManagedBean(name="employeeBean")
@RequestScoped
public class EmployeeBean implements Serializable{

    private static final long serialVersionUID = 1L;

    private static final List<Employee> employees = Arrays.asList(
            Employee.builder().id(1).name("John Smith").salary(100).build(),
            Employee.builder().id(2).name("Donald Trump").salary(200).build(),
            Employee.builder().id(3).name("Hilary Clinton").salary(400).build(),
            Employee.builder().id(4).name("James Gosling").salary(2000).build(),
            Employee.builder().id(5).name("Venkat Subramaniam").salary(10000).build()

    );

    @EJB
    private EmployeeFacade employeeFacade;

    public List<Employee> getEmployees() {
        return employeeFacade.getEmployees();
    }


}
