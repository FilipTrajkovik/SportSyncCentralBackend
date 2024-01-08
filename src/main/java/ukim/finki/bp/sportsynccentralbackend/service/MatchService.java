package ukim.finki.bp.sportsynccentralbackend.service;

import ukim.finki.bp.sportsynccentralbackend.model.Match;
import ukim.finki.bp.sportsynccentralbackend.model.Player;
import ukim.finki.bp.sportsynccentralbackend.model.view.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public interface MatchService {

    List<Match> findAll();

    List<MatchWithCapacityView> getMatchWithCapacity();

    List<MatchWithGuestTeamsAndPlayersView> getMatchWithGuestTeamsAndPlayers();

    List<MatchWithHostTeamsAndPlayersView> getMatchWithHostTeamsAndPlayers();

    List<MatchWithTeamsView> getMatchWithTeamsView();

    void insertNewMatch(String name,
                       String category,
                       String sportType,
                       LocalDate matchDate,
                       LocalTime startTime,
                       LocalTime endTime,
                       Integer idGuestTeam,
                       Integer idHomeTeam,
                       Integer idSportHall);

    Match findMatch(Integer matchId);

    List<MatchWithHostTeamsAndPlayersView> getHomeTeamPlayers(Integer matchId);

    List<MatchWithGuestTeamsAndPlayersView> getGuestTeamPlayers(Integer matchId);

    List<MatchWithCapacityView> getSeatsAvailableForMatch(Integer matchId);

    List<FutureMatchesRemainingCapacity> getFutureMatchesRemainingCapacity();
}
