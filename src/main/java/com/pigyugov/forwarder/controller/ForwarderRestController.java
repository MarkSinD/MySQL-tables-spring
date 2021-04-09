package com.pigyugov.forwarder.controller;

import com.pigyugov.forwarder.service.CooperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DECRIPTION
 *
 * @author Mark Sinakaev
 * @version 1.0
 */
@RestController
public class ForwarderRestController {
    @Autowired
    private CooperatorService cooperatorService;

    @PostMapping("/cooperator/check_first_name")
    public String checkDublicateEmail(@Param("id") Integer id, @Param("first_name") String first_name){
        return cooperatorService.isEmailUnique(id, first_name) ? "OK" : "Duplicated";
    }
}
