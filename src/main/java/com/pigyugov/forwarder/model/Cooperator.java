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
@Table(name = "cooperator")
public class Cooperator {
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

    @Column(name = "enable")
    Boolean enabled;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "cooperator_detail_id")
    CooperatorDetail cooperatorDetail;

    @Transient
    public String getPhotosImagePath(){
        if(id == null || photo == null)
            return "/images/default-user.png";

        return "/user-photos/" + this.id + "/" + this.photo;
    }

}
