package com.avalith.challengeJava.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data //getter, setter , tostring, equals
@AllArgsConstructor //constructor con todos los argumentos
@NoArgsConstructor
@Entity //a la clase le damos indentidad de persistencia
public class Vote {
    @Id //para determinar que un campo es el identificador de una clase
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ese id se va a generar de forma autoincremental y con strategy determinamos que es el campo por el cual se va a identificar univocamente
    private Integer id;

    @ManyToOne(fetch= FetchType.EAGER)
    @JsonBackReference
    private Employee employee;


    private LocalDate date;
}
