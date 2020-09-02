package com.avalith.challengeJava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data //getter, setter , tostring, equals
@AllArgsConstructor //constructor con todos los argumentos
@NoArgsConstructor
@Entity //a la clase le damos indentidad de persistencia
public class Admin extends User {
    private String acceso;
}
