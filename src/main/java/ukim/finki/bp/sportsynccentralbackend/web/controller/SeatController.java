package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukim.finki.bp.sportsynccentralbackend.model.Seat;
import ukim.finki.bp.sportsynccentralbackend.service.SeatService;

import java.util.List;

@RestController
@RequestMapping("/seat")
@CrossOrigin
public class SeatController {

    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/all")
    public List<Seat> getAllSeats() {
        return seatService.findAll();
    }
}
