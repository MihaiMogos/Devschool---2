package jsf.model.employee;

import ejb.EmployeeFacade;
import jpa.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="employeeBeanDelete")
@RequestScoped
@Getter
@Setter
public class EmployeeBeanDelete {

    @EJB
    private EmployeeFacade employeeFacade;

    public String delete(Employee e) {
        employeeFacade.deleteEmployee(e);
        return null;
    }
}
