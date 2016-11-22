package jaxrs.resource;

/**
 * Created by Mucefix on 22/11/16.
 */
import ejb.EmployeeFacade;
import jpa.Employee;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("helloworld")
public class HelloWorldResource {
    public static final String CLICHED_MESSAGE = "Hello World!";

    @EJB
    EmployeeFacade employeeFacade;

    @GET
    @Produces("text/plain")
    public String getHello() {
        List<Employee> employees = employeeFacade.getEmployees();

        return CLICHED_MESSAGE;
    }
}
