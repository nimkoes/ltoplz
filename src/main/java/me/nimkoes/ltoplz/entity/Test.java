package me.nimkoes.ltoplz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Test {

    @Id
    @GeneratedValue
    @Column(name = "TEST_ID")
    private Long id;

}
