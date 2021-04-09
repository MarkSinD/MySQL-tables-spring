package com.pigyugov.forwarder.dao;

import com.pigyugov.forwarder.model.Cooperator;
import com.pigyugov.forwarder.model.CooperatorDetail;
import com.pigyugov.forwarder.model.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * DECRIPTION
 *
 * @author Mark Sinakaev
 * @version 1.0
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
