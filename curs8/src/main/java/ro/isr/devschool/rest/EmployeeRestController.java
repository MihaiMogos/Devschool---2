package ro.isr.devschool.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.isr.devschool.jpa.Employee;
import ro.isr.devschool.jpa.EmployeeRepository;

import java.util.Collection;

/**
 * Created by Mihai MOGOS on 06/12/16.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Employee>> getAllEmployees(){
        return new ResponseEntity<>((Collection<Employee>) repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Employee> getEmployeeWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, params = {"name"})
    public ResponseEntity<Collection<Employee>> findEmployeeWithName(@RequestParam(value="name") String name) {
        return new ResponseEntity<>(repository.findByName(name), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addEmployee(@RequestBody Employee input) {
        return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);
    }
}
