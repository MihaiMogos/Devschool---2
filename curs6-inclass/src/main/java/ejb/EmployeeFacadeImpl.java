package ejb;

import jpa.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
@Stateless
public class EmployeeFacadeImpl implements EmployeeFacade{

    @PersistenceContext(unitName = "helloWorldDS")
    private EntityManager entityManager;

    public List<Employee> getEmployees(){
        Query query = entityManager.createQuery( "SELECT e FROM Employee e" );
        return (List<Employee>) query.getResultList();
    }

    public void addEmployee(Employee employee){
        entityManager.persist(employee);
    }

    public void deleteEmployee(Employee employee){
        employee = entityManager.merge(employee);
        entityManager.remove(employee);
    }

    public Employee findEmployee(Integer id) {
        return entityManager.find(Employee.class, id);
    }

}
