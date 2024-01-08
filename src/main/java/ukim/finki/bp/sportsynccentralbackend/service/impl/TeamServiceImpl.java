package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.Team;
import ukim.finki.bp.sportsynccentralbackend.repository.TeamRepository;
import ukim.finki.bp.sportsynccentralbackend.service.TeamService;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> findAll() {
        return this.teamRepository.findAll();
    }
}
