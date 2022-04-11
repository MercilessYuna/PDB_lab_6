package com.example.attempt.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
@Getter
@Setter
@ToString
public class Student extends BaseEntity {
    @Column(name = "FIO")
    private String fio;

    @Column(name = "email")
    private String email;

    @OneToMany()
    @JoinColumn(name = "forms")
    private Set<Form> formSet;
}
