package ro.isr.devschool.jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Mihai MOGOS on 06/12/16.
 */
@Entity
@Getter @Setter
@Builder
public class Employee {

    @Tolerate
    public Employee(){}

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private double salary;


}
