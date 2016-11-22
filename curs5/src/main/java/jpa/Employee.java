package jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Mucefix on 22/11/16.
 */
@Entity
@Getter @Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private double salary;


}
