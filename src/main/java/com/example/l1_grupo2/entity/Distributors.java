package com.example.l1_grupo2.entity;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "distibuidoras")
public class Distributors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddistribuidora", nullable = false)
    private Integer id;

}
