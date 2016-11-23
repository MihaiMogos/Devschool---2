package jaxrs.resource;

import ejb.EmployeeFacade;
import jpa.Employee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
@Path("employees")
public class EmployeeResource {
    @EJB
    EmployeeFacade employeeFacade;

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getHello() {
        List<Employee> employees = employeeFacade.getEmployees();
        return Response.ok(employees).build();
    }
}
