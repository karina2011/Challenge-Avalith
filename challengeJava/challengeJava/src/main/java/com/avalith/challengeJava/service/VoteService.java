package com.avalith.challengeJava.service;

import com.avalith.challengeJava.model.Vote;
import com.avalith.challengeJava.repository.IVoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VoteService {
    private IVoteRepository voteRepository;

    @Autowired
    public VoteService (IVoteRepository voteRepository){
        this.voteRepository=voteRepository;
    }

    public void add_vote(Vote one_vote) {
        this.voteRepository.save(one_vote);
    }

    public List<Vote> get_all_vote_moth(Integer month) {
        final List<Vote> collect = this.voteRepository.findAll().stream()
                .filter(vote -> vote.getDate().getMonth().equals(month)).collect(Collectors.toList());
        return collect;
    }
}
