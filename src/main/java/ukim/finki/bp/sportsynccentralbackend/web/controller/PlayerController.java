package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukim.finki.bp.sportsynccentralbackend.model.Player;
import ukim.finki.bp.sportsynccentralbackend.model.view.PlayersMatchesPlayedWithAttendence;
import ukim.finki.bp.sportsynccentralbackend.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return playerService.findAll();
    }

    @GetMapping("/getPlayersMatchesPlayedWithAttendence")
    public List<PlayersMatchesPlayedWithAttendence> getPlayersMatchesPlayedWithAttendence() {
        return playerService.getPlayersMatchesPlayedWithAttendence();
    }
}
