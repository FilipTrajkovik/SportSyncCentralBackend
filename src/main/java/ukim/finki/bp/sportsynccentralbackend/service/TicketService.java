package ukim.finki.bp.sportsynccentralbackend.service;

import ukim.finki.bp.sportsynccentralbackend.model.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketService {

    List<Ticket> findAll();

    void insertNewTicket(
            Integer price,
            String locationBought,
            Integer idMatch,
            Integer idSpectator,
            Integer idSeat,
            Integer idSportHall
    );
}
