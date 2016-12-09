package ro.isr.devschool.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Mihai MOGOS on 06/12/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByName(String name);
}
