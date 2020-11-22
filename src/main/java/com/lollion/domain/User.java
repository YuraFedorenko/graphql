package com.lollion.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    @SequenceGenerator(name = "users_id", sequenceName = "users_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id")
    @Column(name = "id", nullable = false)
    @EqualsAndHashCode.Exclude
    private Long id;

    private String name;
    private String status;

    public User(String name, String status) {
        this.name = name;
        this.status = status;
    }
}
