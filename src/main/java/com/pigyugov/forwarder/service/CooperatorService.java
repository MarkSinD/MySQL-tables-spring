package com.pigyugov.forwarder.service;

import com.pigyugov.forwarder.dao.CooperatorDetailRepository;
import com.pigyugov.forwarder.dao.CooperatorRepository;
import com.pigyugov.forwarder.exception.UserNotFoundException;
import com.pigyugov.forwarder.model.Cooperator;
import com.pigyugov.forwarder.model.CooperatorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * DECRIPTION
 *
 * @author Mark Sinakaev
 * @version 1.0
 */
@Service
@Transactional
public class CooperatorService {
    @Autowired
    private CooperatorRepository cooperatorRepository;

    @Autowired
    private CooperatorDetailRepository cooperatorDetailRepository;

    public List<Cooperator> listAllCooperator(){
        return (List<Cooperator>) cooperatorRepository.findAll();
    }

    public List<CooperatorDetail> listAllCooperatorDetail(){
        return (List<CooperatorDetail>) cooperatorDetailRepository.findAll();
    }

    public Cooperator save(Cooperator cooperator) {
        return cooperatorRepository.save(cooperator);
    }

    public boolean isEmailUnique(Integer id, String firstName){
        Cooperator cooperatorByFirstName = cooperatorRepository.getfirstNameByFirstName(firstName);

        if( id != null && cooperatorByFirstName == null) {
            return true;
        }
        else if( id != null && cooperatorByFirstName != null) {
            return true;
        }
        else if( id == null && cooperatorByFirstName != null) {
            return false;
        }
        else if(id == null && cooperatorByFirstName == null) {
            return true;
        }
        return false;
    }

    public void updateCooperatorEnableStatus(Integer id, boolean enabled){
        cooperatorRepository.updateEnableStatus(id, enabled);
    }

    public Cooperator getUserById(Integer id) throws UserNotFoundException {
        try {
            return cooperatorRepository.findById(id).get();
        } catch (NoSuchElementException exception){
            throw new UserNotFoundException("Could not find any user with ID");
        }
    }

    public void delete(Integer id) throws UserNotFoundException {
        Long countById = cooperatorRepository.countById(id);
        if(countById == null || countById == 0){
            throw new UserNotFoundException("Could not find any user with ID" + id);
        }
        cooperatorRepository.deleteById(id);
    }
}
