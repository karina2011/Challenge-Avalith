package com.avalith.challengeJava.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data //getter, setter , tostring, equals
@AllArgsConstructor //constructor con todos los argumentos
@NoArgsConstructor
@Entity //a la clase le damos indentidad de persistencia
public class User {
    @Id //para determinar que un campo es el identificador de una clase
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ese id se va a generar de forma autoincremental y con strategy determinamos que es el campo por el cual se va a identificar univocamente
    private Integer id;

    private String name;
    private String last_name;

}
