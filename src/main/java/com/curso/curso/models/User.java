package com.curso.curso.models;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode
public class User {

    @Id
    @Getter @Setter @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter  @Column(name= "name")
    private String name;

    @Getter @Setter  @Column(name= "lastName")
    private String lastName;

    @Getter @Setter  @Column(name= "email")
    private String email;

    @Getter @Setter  @Column(name= "phone")
    private String phone;

    @Getter @Setter  @Column(name= "password")
    private String password;

}
