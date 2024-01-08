package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ukim.finki.bp.sportsynccentralbackend.model.PlayerPlaysForTeam;
import ukim.finki.bp.sportsynccentralbackend.service.PlayerPlaysForTeamService;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("player-plays-for-team")
@CrossOrigin
public class PlayerPlaysForTeamController {

    private final PlayerPlaysForTeamService playerPlaysForTeamService;

    public PlayerPlaysForTeamController(PlayerPlaysForTeamService playerPlaysForTeamService) {
        this.playerPlaysForTeamService = playerPlaysForTeamService;
    }

    @GetMapping("/all")
    public List<PlayerPlaysForTeam> getAllPlayersPlaysForTeam() {
        return this.playerPlaysForTeamService.findAll();
    }

    @PostMapping("/playerChangeTeam")
    @Transactional(rollbackFor = Exception.class)
    public void playerChangeTeam(@RequestParam  Integer idTeam,
                                 @RequestParam  Integer idPlayer,
                                 @RequestParam  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFrom,
                                 @RequestParam  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateTo) {
        playerPlaysForTeamService.playerChangeTeam(idTeam, idPlayer, dateFrom, dateTo);

    }
}
