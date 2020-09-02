package com.avalith.challengeJava.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Data //getter, setter , tostring, equals
@AllArgsConstructor //constructor con todos los argumentos
@NoArgsConstructor
@Entity //a la clase le damos indentidad de persistencia
public class Employee extends User{
    private String work_area;

    @OneToMany(mappedBy = "employee")
    private List<Vote> votes;
}
