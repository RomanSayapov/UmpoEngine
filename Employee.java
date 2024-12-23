package com.example.UmpoEngine.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastName;
    private String firstName;
    private String middleName;

    @ManyToOne
    @JoinColumn(name = "engine_id", nullable = false)
    private Engine engine;
}

