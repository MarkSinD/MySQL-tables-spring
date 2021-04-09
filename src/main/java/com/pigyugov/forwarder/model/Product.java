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
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "photo")
    String photo;

    @Column(name = "description")
    String description;

    @Column(name = "purchase_cost")
    Integer purchaseCost;

    @Column(name = "availability")
    Boolean availability;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "sale_value")
    Integer saleValue;

    @Column(name = "product_id")
    Integer productId;

    @Column(name = "enable")
    Boolean enabled;
}
