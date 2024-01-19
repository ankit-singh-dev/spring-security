package com.examples.springsecurity.models;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Order {

    @Id
    @Column(length=40)
    @GeneratedValue(generator = "randomId")
    @GenericGenerator(name="randomId", strategy="com.examples.springsecurity.models.RandomIdGenerator")
    private String id;

    private String productName;

    private Integer productRating;

    @ManyToOne
    private Customer customer;
}
