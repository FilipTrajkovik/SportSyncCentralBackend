package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.PlayerPlaysForTeam;
import ukim.finki.bp.sportsynccentralbackend.repository.PlayerPlaysForTeamRepository;
import ukim.finki.bp.sportsynccentralbackend.service.PlayerPlaysForTeamService;

import java.time.LocalDate;
import java.util.List;

@Service
public class PlayerPlaysForTeamServiceImpl implements PlayerPlaysForTeamService {

    private final PlayerPlaysForTeamRepository playerPlaysForTeamRepository;

    public PlayerPlaysForTeamServiceImpl(PlayerPlaysForTeamRepository playerPlaysForTeamRepository) {
        this.playerPlaysForTeamRepository = playerPlaysForTeamRepository;
    }

    @Override
    public List<PlayerPlaysForTeam> findAll() {
        return this.playerPlaysForTeamRepository.findAll();
    }

    @Override
    public void playerChangeTeam(Integer idTeam, Integer idPlayer, LocalDate dateFrom, LocalDate dateTo) {
        playerPlaysForTeamRepository.playerChangeTeam(idTeam, idPlayer, dateFrom, dateTo);
    }
}
