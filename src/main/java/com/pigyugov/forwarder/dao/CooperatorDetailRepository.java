package com.pigyugov.forwarder.dao;

import com.pigyugov.forwarder.model.Cooperator;
import com.pigyugov.forwarder.model.CooperatorDetail;
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
public interface CooperatorDetailRepository extends CrudRepository<CooperatorDetail, Integer> {
    @Query("SELECT u FROM CooperatorDetail u WHERE u.position = :position")
    public Cooperator getfirstNameByFirstName(@Param("position") String position);

    public Long countById(Integer id);

    @Query("UPDATE CooperatorDetail u SET u.enabled = ?2 WHERE u.id = ?1")
    @Modifying
    public void updateEnableStatus(Integer id, boolean enabled);

}
