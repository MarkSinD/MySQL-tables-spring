package com.pigyugov.forwarder.model;

import lombok.Data;

import javax.persistence.*;

/**
 * DECRIPTION
 *
 * @author Mark Sinakaev
 * @version 1.0
 */
@Entity
@Data
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "photo")
    String photo;

    @Column(name = "address")
    String address;

    @Column(name = "telephone")
    Integer telephone;

    @Column(name = "enable")
    Boolean enabled;
}
