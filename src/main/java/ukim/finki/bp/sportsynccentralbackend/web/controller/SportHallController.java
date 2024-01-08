package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukim.finki.bp.sportsynccentralbackend.model.SportHall;
import ukim.finki.bp.sportsynccentralbackend.service.SportHallService;

import java.util.List;

@RestController
@RequestMapping("/sport-hall")
@CrossOrigin
public class SportHallController {

    private final SportHallService sportHallService;

    public SportHallController(SportHallService sportHallService) {
        this.sportHallService = sportHallService;
    }

    @GetMapping("/all")
    public List<SportHall> getAllSportHalls() {
        return sportHallService.findAll();
    }
}
