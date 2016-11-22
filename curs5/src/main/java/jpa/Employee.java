package jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.*;

/**
 * Created by Mucefix on 22/11/16.
 */
@Entity
@Getter @Setter @Builder
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
