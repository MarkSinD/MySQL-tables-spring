package com.pigyugov.forwarder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DECRIPTION
 *
 * @author Mark Sinakaev
 * @version 1.0
 */
@Entity
@Data
@Table(name = "cooperator_detail")
public class CooperatorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "position")
    String position;

    @Column(name = "start_contract")
    Date startContract;

    @Column(name = "end_contract")
    Date endContract;

    @Column(name = "p_number")
    Integer phoneNumber;

    @Column(name = "enable")
    Boolean enabled;

}

