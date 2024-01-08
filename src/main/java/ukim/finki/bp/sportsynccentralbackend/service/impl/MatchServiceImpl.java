package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.Match;
import ukim.finki.bp.sportsynccentralbackend.model.view.*;
import ukim.finki.bp.sportsynccentralbackend.repository.*;
import ukim.finki.bp.sportsynccentralbackend.service.MatchService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    private final MatchWithCapacityRepository matchWithCapacityRepository;

    private final MatchWithGuestTeamsAndPlayersRepository matchWithGuestTeamsAndPlayersRepository;

    private final MatchWithHostTeamsAndPlayersRepository matchWithHostTeamsAndPlayersRepository;

    private final MatchWithTeamsViewRepository matchWithTeamsViewRepository;

    private final FutureMatchesRemainingCapacityRepository futureMatchesRemainingCapacityRepository;

    private final PlayerRepository playerRepository;

    public MatchServiceImpl(MatchRepository matchRepository, MatchWithCapacityRepository matchWithCapacityRepository, MatchWithGuestTeamsAndPlayersRepository matchWithGuestTeamsAndPlayersRepository, MatchWithHostTeamsAndPlayersRepository matchWithHostTeamsAndPlayersRepository, MatchWithTeamsViewRepository matchWithTeamsViewRepository, FutureMatchesRemainingCapacityRepository futureMatchesRemainingCapacityRepository, PlayerRepository playerRepository) {
        this.matchRepository = matchRepository;
        this.matchWithCapacityRepository = matchWithCapacityRepository;
        this.matchWithGuestTeamsAndPlayersRepository = matchWithGuestTeamsAndPlayersRepository;
        this.matchWithHostTeamsAndPlayersRepository = matchWithHostTeamsAndPlayersRepository;
        this.matchWithTeamsViewRepository = matchWithTeamsViewRepository;
        this.futureMatchesRemainingCapacityRepository = futureMatchesRemainingCapacityRepository;
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Match> findAll() {
        return this.matchRepository.findAll();
    }

    @Override
    public List<MatchWithCapacityView> getMatchWithCapacity() {
        return this.matchWithCapacityRepository.findAll();
    }

    @Override
    public List<MatchWithGuestTeamsAndPlayersView> getMatchWithGuestTeamsAndPlayers() {
        return this.matchWithGuestTeamsAndPlayersRepository.findAll();
    }

    @Override
    public List<MatchWithHostTeamsAndPlayersView> getMatchWithHostTeamsAndPlayers() {
        return this.matchWithHostTeamsAndPlayersRepository.findAll();
    }

    @Override
    public List<MatchWithTeamsView> getMatchWithTeamsView() {
        return this.matchWithTeamsViewRepository.findAll();
    }

    @Override
    public void insertNewMatch(String name, String category, String sportType, LocalDate matchDate, LocalTime startTime, LocalTime endTime, Integer idGuestTeam, Integer idHomeTeam, Integer idSportHall) {
        matchRepository.insertNewMatch(name, category, sportType, matchDate, startTime, endTime, idGuestTeam, idHomeTeam, idSportHall);
    }

    @Override
    public Match findMatch(Integer matchId) {
        return matchRepository.findById(matchId).get();
    }

    @Override
    public List<MatchWithHostTeamsAndPlayersView> getHomeTeamPlayers(Integer matchId) {
        return matchWithHostTeamsAndPlayersRepository.findAllByMatchId(matchId);
    }

    @Override
    public List<MatchWithGuestTeamsAndPlayersView> getGuestTeamPlayers(Integer matchId) {
        return matchWithGuestTeamsAndPlayersRepository.findAllByMatchId(matchId);
    }

    @Override
    public List<MatchWithCapacityView> getSeatsAvailableForMatch(Integer matchId) {
        return matchWithCapacityRepository.findAllByMatchId(matchId);
    }

    @Override
    public List<FutureMatchesRemainingCapacity> getFutureMatchesRemainingCapacity() {
        return futureMatchesRemainingCapacityRepository.findAll();
    }


}
