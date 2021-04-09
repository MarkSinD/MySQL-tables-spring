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
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "supplier_name")
    String supplierName;

    @Column(name = "contact_number")
    Integer contactNumber;

    @Column(name = "photo")
    String photo;

    @Column(name = "address")
    String address;

    @Column(name = "enable")
    Boolean enabled;
}
