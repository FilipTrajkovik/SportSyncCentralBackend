package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.Spectator;
import ukim.finki.bp.sportsynccentralbackend.model.view.SpectatorAttendenceView;
import ukim.finki.bp.sportsynccentralbackend.model.view.SpectatorWithMostTicketsForLastYear;
import ukim.finki.bp.sportsynccentralbackend.repository.SpectatorAttendenceRepository;
import ukim.finki.bp.sportsynccentralbackend.repository.SpectatorRepository;
import ukim.finki.bp.sportsynccentralbackend.repository.SpectatorWithMostTicketsForLastYearRepository;
import ukim.finki.bp.sportsynccentralbackend.service.SpectatorService;

import java.util.List;

@Service
public class SpectatorServiceImpl implements SpectatorService {

    private final SpectatorRepository spectatorRepository;

    private final SpectatorAttendenceRepository spectatorAttendenceRepository;

    private final SpectatorWithMostTicketsForLastYearRepository spectatorWithMostTicketsForLastYearRepository;

    public SpectatorServiceImpl(SpectatorRepository spectatorRepository, SpectatorAttendenceRepository spectatorAttendenceRepository, SpectatorWithMostTicketsForLastYearRepository spectatorWithMostTicketsForLastYearRepository) {
        this.spectatorRepository = spectatorRepository;
        this.spectatorAttendenceRepository = spectatorAttendenceRepository;
        this.spectatorWithMostTicketsForLastYearRepository = spectatorWithMostTicketsForLastYearRepository;
    }

    @Override
    public List<Spectator> findAll() {
        return this.spectatorRepository.findAll();
    }

    @Override
    public List<SpectatorAttendenceView> getSpectatorAttendence() {
        return this.spectatorAttendenceRepository.findAll();
    }

    @Override
    public SpectatorWithMostTicketsForLastYear getSpectatorWithMostTicketsForLastYear() {
        return this.spectatorWithMostTicketsForLastYearRepository.findAll().get(0);
    }
}
