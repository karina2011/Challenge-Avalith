package com.avalith.challengeJava.repository;

import com.avalith.challengeJava.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoteRepository extends JpaRepository<Vote,Integer>{
}
