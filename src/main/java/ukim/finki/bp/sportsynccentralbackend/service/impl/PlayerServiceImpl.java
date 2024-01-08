package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.Player;
import ukim.finki.bp.sportsynccentralbackend.model.view.PlayersMatchesPlayedWithAttendence;
import ukim.finki.bp.sportsynccentralbackend.repository.PlayerRepository;
import ukim.finki.bp.sportsynccentralbackend.repository.PlayersMatchesPlayedWithAttendenceRepository;
import ukim.finki.bp.sportsynccentralbackend.service.PlayerService;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    private final PlayersMatchesPlayedWithAttendenceRepository playersMatchesPlayedWithAttendenceRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository, PlayersMatchesPlayedWithAttendenceRepository playersMatchesPlayedWithAttendenceRepository) {
        this.playerRepository = playerRepository;
        this.playersMatchesPlayedWithAttendenceRepository = playersMatchesPlayedWithAttendenceRepository;
    }

    @Override
    public List<Player> findAll() {
        return this.playerRepository.findAll();
    }

    @Override
    public List<PlayersMatchesPlayedWithAttendence> getPlayersMatchesPlayedWithAttendence() {
        return this.playersMatchesPlayedWithAttendenceRepository.findAll();
    }
}
