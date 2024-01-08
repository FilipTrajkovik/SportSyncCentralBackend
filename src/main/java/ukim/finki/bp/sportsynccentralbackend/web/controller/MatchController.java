package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ukim.finki.bp.sportsynccentralbackend.model.Match;
import ukim.finki.bp.sportsynccentralbackend.model.Player;
import ukim.finki.bp.sportsynccentralbackend.model.view.*;
import ukim.finki.bp.sportsynccentralbackend.service.MatchService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/all")
    public List<Match> getAllMatches() {
        return matchService.findAll();
    }

    @GetMapping("/{id}")
    public Match match(@PathVariable Integer id) {
        return matchService.findMatch(id);
    }

    @GetMapping("/allMatchesWithCapacity")
    public List<MatchWithCapacityView> getAllMatchesWithCapacity() {
        return matchService.getMatchWithCapacity();
    }

    @GetMapping("/allMatchWithGuestTeamsAndPlayers")
    public List<MatchWithGuestTeamsAndPlayersView> getAllMatchWithGuestTeamsAndPlayersView() {
        return matchService.getMatchWithGuestTeamsAndPlayers();
    }

    @GetMapping("/allMatchWithHostTeamsAndPlayers")
    public List<MatchWithHostTeamsAndPlayersView> getAllMatchWithHostTeamsAndPlayersView() {
        return matchService.getMatchWithHostTeamsAndPlayers();
    }

    @GetMapping("/allMatchWithTeams")
    public List<MatchWithTeamsView> getAllMatchWithTeamsView() {
        return matchService.getMatchWithTeamsView();
    }

    @GetMapping("/homeTeamPlayers/{matchId}")
    public List<MatchWithHostTeamsAndPlayersView> getHomeTeamPlayers(@PathVariable Integer matchId) {
        return matchService.getHomeTeamPlayers(matchId);
    }

    @GetMapping("/guestTeamPlayers/{matchId}")
    public List<MatchWithGuestTeamsAndPlayersView> getGuestTeamPlayers(@PathVariable Integer matchId) {
        return matchService.getGuestTeamPlayers(matchId);
    }

    @GetMapping("/seatsAvailableForMatch/{matchId}")
    public List<MatchWithCapacityView> getSeatsAvailableForMatch(@PathVariable Integer matchId) {
        return matchService.getSeatsAvailableForMatch(matchId);
    }

    @PostMapping(value = "/add")
    @Transactional(rollbackFor = Exception.class)
    public void insertNewMatch(@RequestParam String name,
                               @RequestParam String category,
                               @RequestParam String sportType,
                               @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate matchDate,
                               @RequestParam LocalTime startTime,
                               @RequestParam LocalTime endTime,
                               @RequestParam Integer idHomeTeam,
                               @RequestParam Integer idGuestTeam,
                               @RequestParam Integer idSportHall) {
        matchService.insertNewMatch(name, category, sportType, matchDate, startTime, endTime, idHomeTeam, idGuestTeam, idSportHall);
    }

    @GetMapping("/getFutureMatchesRemainingCapacity")
    public List<FutureMatchesRemainingCapacity> getFutureMatchesRemainingCapacity() {
        return matchService.getFutureMatchesRemainingCapacity();
    }
}