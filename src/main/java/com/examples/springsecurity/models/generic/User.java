package com.examples.springsecurity.models.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "my_user")
public class User {

    @Id
    @Column(length=40)
    @GeneratedValue(generator = "randomId")
    @GenericGenerator(name="randomId", strategy="com.examples.springsecurity.models.RandomIdGenerator")
    private String id;

    private String userName;

    private String password;

    private String roles;

    private boolean enabled;

}
