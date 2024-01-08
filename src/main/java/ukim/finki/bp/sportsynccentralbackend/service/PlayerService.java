package ukim.finki.bp.sportsynccentralbackend.service;

import ukim.finki.bp.sportsynccentralbackend.model.Player;
import ukim.finki.bp.sportsynccentralbackend.model.view.PlayersMatchesPlayedWithAttendence;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();

    List<PlayersMatchesPlayedWithAttendence> getPlayersMatchesPlayedWithAttendence();
}
