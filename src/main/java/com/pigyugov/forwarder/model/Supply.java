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
@Table(name = "supply")
public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "provider_id")
    Integer providerId;

    @Column(name = "date_of_delivery")
    Integer dateOfDelivery;

    @Column(name = "enable")
    Boolean enabled;
}
