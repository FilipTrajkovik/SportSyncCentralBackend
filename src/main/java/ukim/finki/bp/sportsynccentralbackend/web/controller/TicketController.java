package ukim.finki.bp.sportsynccentralbackend.web.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ukim.finki.bp.sportsynccentralbackend.model.Ticket;
import ukim.finki.bp.sportsynccentralbackend.service.TicketService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/all")
    public List<Ticket> getAllTickets() {
        return ticketService.findAll();
    }

    @PostMapping("/add")
    @Transactional(rollbackFor = Exception.class)
    public void insertNewTicket (@RequestParam  Integer price,
                                 @RequestParam  String locationBought,
                                 @RequestParam  Integer idMatch,
                                 @RequestParam  Integer idSpectator,
                                 @RequestParam  Integer idSeat,
                                 @RequestParam  Integer idSportHall) {
        ticketService.insertNewTicket(price, locationBought, idMatch, idSpectator, idSeat, idSportHall);
    }
}
