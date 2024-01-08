package ukim.finki.bp.sportsynccentralbackend.service;

import ukim.finki.bp.sportsynccentralbackend.model.Spectator;
import ukim.finki.bp.sportsynccentralbackend.model.view.SpectatorAttendenceView;
import ukim.finki.bp.sportsynccentralbackend.model.view.SpectatorWithMostTicketsForLastYear;

import java.util.List;

public interface SpectatorService {

    List<Spectator> findAll();

    List<SpectatorAttendenceView> getSpectatorAttendence();

    SpectatorWithMostTicketsForLastYear getSpectatorWithMostTicketsForLastYear();
}
