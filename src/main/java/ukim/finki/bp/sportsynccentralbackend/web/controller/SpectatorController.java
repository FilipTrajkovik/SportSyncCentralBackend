package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukim.finki.bp.sportsynccentralbackend.model.Spectator;
import ukim.finki.bp.sportsynccentralbackend.model.view.SpectatorAttendenceView;
import ukim.finki.bp.sportsynccentralbackend.model.view.SpectatorWithMostTicketsForLastYear;
import ukim.finki.bp.sportsynccentralbackend.service.SpectatorService;

import java.util.List;

@RestController
@RequestMapping("/spectator")
@CrossOrigin
public class SpectatorController {

    private final SpectatorService spectatorService;

    public SpectatorController(SpectatorService spectatorService) {
        this.spectatorService = spectatorService;
    }

    @GetMapping("/all")
    public List<Spectator> getAllSpectators() {
        return spectatorService.findAll();
    }

    @GetMapping("/allSpectatorAttendence")
    public List<SpectatorAttendenceView> getAllSpectatorAttedences(){
        return spectatorService.getSpectatorAttendence();
    }

    @GetMapping("/spectatorWithMostTicketsForLastYear")
    public SpectatorWithMostTicketsForLastYear getSpectatorWithMostTicketsForLastYear() {
        return spectatorService.getSpectatorWithMostTicketsForLastYear();
    }
}
