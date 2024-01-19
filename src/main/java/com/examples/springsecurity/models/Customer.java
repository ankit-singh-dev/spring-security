package com.examples.springsecurity.models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @Column(length=40)
    @GeneratedValue(generator = "randomId")
    @GenericGenerator(name="randomId", strategy="com.examples.springsecurity.models.RandomIdGenerator")
    private String id;

    private String name;

    private String address;

}
