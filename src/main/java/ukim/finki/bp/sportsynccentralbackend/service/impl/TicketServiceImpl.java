package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.Ticket;
import ukim.finki.bp.sportsynccentralbackend.repository.TicketRepository;
import ukim.finki.bp.sportsynccentralbackend.service.TicketService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> findAll() {
        return this.ticketRepository.findAll();
    }

    @Override
    public void insertNewTicket(Integer price, String locationBought, Integer idMatch, Integer idSpectator, Integer idSeat, Integer idSportHall) {
        ticketRepository.insertNewTicket(LocalDateTime.now(), price, locationBought, idMatch, idSpectator, idSeat, idSportHall);
    }
}
