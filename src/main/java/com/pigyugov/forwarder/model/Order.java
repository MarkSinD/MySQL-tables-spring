package com.pigyugov.forwarder.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * DECRIPTION
 *
 * @author Mark Sinakaev
 * @version 1.0
 */
@Entity
@Data
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "product_id")
    Integer productId;

    @Column(name = "cooperator_id")
    Integer cooperatorId;

    @Column(name = "client_id")
    Integer clientId;

    @Column(name = "date_of_placement")
    Date dateOfPlacement;

    @Column(name = "due_date")
    Date dueDate;

    @Column(name = "enable")
    Boolean enabled;
}
