package ro.isr.devschool.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mihai MOGOS on 08/12/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
