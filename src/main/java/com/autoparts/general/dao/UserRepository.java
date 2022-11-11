package com.autoparts.general.dao;

import com.autoparts.general.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


}
