package jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
@Getter @Setter @Builder
@Entity
public class Employee {

    @Tolerate
    public Employee(){}

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private double salary;


}
