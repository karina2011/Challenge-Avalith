package com.avalith.challengeJava.controller;

import com.avalith.challengeJava.model.Vote;
import com.avalith.challengeJava.service.EmployeeService;
import com.avalith.challengeJava.service.VoteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;


@RestController("")
@RequestMapping("/v")
public class VoteController {

    private final VoteService voteService;
    private final EmployeeService employeeService;

    public VoteController (VoteService voteService, EmployeeService employeeService){
        this.voteService = voteService;
        this.employeeService = employeeService;
    }

    @PostMapping("/{id_employee}/voteFor/{id_employee_vote}")
    public void add_vote(@PathVariable Integer id_employee, @PathVariable Integer id_employee_vote) {
        if (!id_employee.equals(id_employee_vote)) {
            List<Vote> votes=employeeService.getVoteEmployee(id_employee_vote);
            votes=votes.stream().filter(vote->vote.getDate().getMonth()==(LocalDate.now().getMonth())).collect(Collectors.toList());

            if(!votes.contains(employeeService.getById(id_employee)))
            {
                Vote one_vote= new Vote();
                one_vote.setDate(LocalDate.now());
                one_vote.setEmployee(employeeService.getById(id_employee_vote));
                voteService.add_vote(one_vote);
                employeeService.getById(id_employee).getVotes().add(one_vote);
            }
        }
    }
}
