package jsf.model.employee;

import ejb.EmployeeFacade;
import jpa.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
@ManagedBean(name="employeeBeanAdd")
@RequestScoped
@Getter @Setter
public class EmployeeBeanAdd {

    @EJB
    private EmployeeFacade employeeFacade;

    private int id;

    private String name;

    private double salary;

    public String add() {

        if (id != 0) {
            Employee newEmployee = Employee.builder().id(id).name(name).salary(salary).build();
            employeeFacade.addEmployee(newEmployee);
            return "employees";
        } else {
            return "employeeInvalid";
        }
    }
}
