package com.avalith.challengeJava.repository;

import com.avalith.challengeJava.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<Admin,Integer> {
}
