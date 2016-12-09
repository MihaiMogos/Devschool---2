package jaxrs.application;

import jaxrs.resource.EmployeeResource;
import jaxrs.resource.HelloWorldResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
@ApplicationPath("/rest")
public class EmployeesRestApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<>(Arrays.asList(HelloWorldResource.class, EmployeeResource.class));
    }
}