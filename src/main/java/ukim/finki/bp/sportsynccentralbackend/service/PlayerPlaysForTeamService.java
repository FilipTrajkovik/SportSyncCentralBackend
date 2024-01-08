package ukim.finki.bp.sportsynccentralbackend.service;

import ukim.finki.bp.sportsynccentralbackend.model.PlayerPlaysForTeam;

import java.time.LocalDate;
import java.util.List;

public interface PlayerPlaysForTeamService {

    List<PlayerPlaysForTeam> findAll();

    void playerChangeTeam(Integer idTeam,
                            Integer idPlayer,
                            LocalDate dateFrom,
                            LocalDate dateTo
    );

}
