package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukim.finki.bp.sportsynccentralbackend.model.Team;
import ukim.finki.bp.sportsynccentralbackend.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/team")
@CrossOrigin
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/all")
    public List<Team> getAllTeams(){
        return teamService.findAll();
    }
}
