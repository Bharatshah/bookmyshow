package com.bms.identity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bms.identity.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {

	DAOUser findByUsername(String username);

}