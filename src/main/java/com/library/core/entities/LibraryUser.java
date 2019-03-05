package com.library.core.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "user")
public class LibraryUser {

    @Id
    @GenericGenerator (name = "increment", strategy = "increment")
    @GeneratedValue (generator = "increment")
    private Integer id;

    @Column (name = "login", nullable = false, unique = true)
    @Basic
    private String login;

    @Column (name = "password", nullable = false)
    @Basic
    private String password;

    @Column (name = "email", nullable = false, unique = true)
    private String email;

    @Column (name = "active")
    @Basic
    private boolean active;
}
