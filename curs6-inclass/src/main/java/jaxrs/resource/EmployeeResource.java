package jaxrs.resource;

import ejb.EmployeeFacade;
import jpa.Employee;

import javax.ejb.EJB;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
@Path("/")
public class EmployeeResource {
    @EJB
    EmployeeFacade employeeFacade;

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("getAll")
    public Response getAll() {
        List<Employee> employees = employeeFacade.getEmployees();
        return Response.ok(employees).build();
    }

    @POST
    @Path("addNew")
    public Response addNewEmployee(@NotNull @QueryParam("id") Integer id,
                                   @NotNull @Size(min = 5, max = 20) @QueryParam("name") String name,
                                   @NotNull @QueryParam("salary") Double salary){
        employeeFacade.addEmployee(Employee.builder().id(id).name(name).salary(salary).build());
        return Response.ok().build();
    }

    @DELETE
    @Path("remove/{id}")
    public Response removeEmployee(@NotNull @PathParam("id") Integer id){

        Employee employee = employeeFacade.findEmployee(id);
        if( employee == null)
            return Response.status(Response.Status.NOT_FOUND).build();

        employeeFacade.deleteEmployee(employee);
        return Response.ok().build();
    }

}
